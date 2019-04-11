package br.com.fiap.orderservice;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.fiap.orderservice.business.OrderBusiness;
import br.com.fiap.orderservice.dto.OrderDTO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@WebMvcTest(OrderBusiness.class)
public class AllTests {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private OrderBusiness orderBusiness;

	@Test
	public void notFoundUser() throws Exception {
		OrderDTO order = new OrderDTO();
		String uri = "/findById/" + order.getIdPedido();
		mvc.perform(get(uri).accept(MediaType.APPLICATION_JSON)).andExpect(status().isNotFound());
	}

	@Test
	public void userFounded() throws Exception {

		OrderDTO order = new OrderDTO();
		order.setIdPedido(1L);
		orderBusiness.save(order);
		when(this.orderBusiness.findById(order.getIdPedido())).thenReturn(order);
		
		mvc.perform(get("/findById/" + order.getIdPedido())
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(status()
		.isOk())
		.andExpect(response -> {
			
			String json = response.getResponse().getContentAsString();
			OrderDTO foundedOrder = new ObjectMapper().readValue(json, OrderDTO.class);
			assertEquals(order.getIdPedido(), foundedOrder.getIdPedido());
		});
	}
	
	@Test
	public void insertUser() throws Exception {
		
		OrderDTO order = new OrderDTO();
		order.setIdPedido(1L);
		String json = new ObjectMapper().writeValueAsString(order);

		mvc.perform(post("/save")
		.accept(MediaType.APPLICATION_JSON)
		.content(json))
		.andExpect(status().isCreated());
	}	
}
