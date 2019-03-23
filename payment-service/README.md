POST
req: localhost:8080/save
{  
      "idTransacao":"",
      "numeroCartao":"",
      "validadeCartao":"",
      "bandeira":""
}
res:
http://localhost:8080/findById/1

GET
req: http://localhost:8080/findById/1
res:
{  
      "idTransacao":"",
      "numeroCartao":"",
      "validadeCartao":"",
      "bandeira":""
}

PUT
req: 
{  
      "idTransacao":"",
      "numeroCartao":"",
      "validadeCartao":"",
      "bandeira":""
}
res:
http://localhost:8080/findById/1

DEL
req:
localhost:8080/delete/1
res:
200
