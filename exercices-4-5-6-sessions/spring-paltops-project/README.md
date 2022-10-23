# Laptops api rest

## Running project and execute following commands ind your terminal for testing api.

for create new laptop

    curl -X POST  localhost:5000/api/laptops -H "Content-Type: application/json" -d '{"branch": "HP", "price": 200000}' && echo " "
 
for find all laptosp

    curl localhost:5000/api/laptops && echo " "

for fin one laptop

    curl localhost:5000/api/laptops/1 && echo " "