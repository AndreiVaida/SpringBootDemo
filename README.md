#How to test the server?
url: `http://localhost:8080`
- do a **GET** request to `/` and you will receive a _Hello World!_ message
- do a **POST** request to `/driver` with a JSON like `{"car": "Ferrari"}`. 
The driver will be saved in DB and you will receive its ID.