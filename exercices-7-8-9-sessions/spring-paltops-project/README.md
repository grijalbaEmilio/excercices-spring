# Laptops api rest

## Running project and execute following commands ind your terminal for testing api.

for create new laptop

    curl -X POST  localhost:5000/api/laptops -H "Content-Type: application/json" -d '{"branch": "HP", "price": 200000}' && echo " "
 
for find all laptops

    curl localhost:5000/api/laptops && echo " "

for find one laptop

    curl localhost:5000/api/laptops/1 && echo " "

for update one laptop

    curl -X PUT localhost:5000/api/laptops -H "Content-Type: application/json" -d '{"id": 1,branch": "new branch", "price": 200000}' && echo " "

for delete one laptop

    curl -X DELETE localhost:5000/api/laptops/1 && echo " "

for delete all laptops

    curl -X DELETE localhost:5000/api/laptops && echo " "

## Api REST documentation
    
    http://localhost:5000/swagger-ui/