# watch-flash-sale

- Rest API's:
-------------

	- I've considered 'users' and 'watches' and 'watches for the sale' will be registered from the UI only, from the internal employee of the company. So, I've developed endpoint API for them.
	1) To register user, make a POST request to this endpoint: "http://localhost:8080/users" in the body provide details of multiple user.
	   - To see all users in the system, make a GET request to this endpoint: "http://localhost:8080/users".
	2) To register watches, make a POST request to this endpoint: "http://localhost:8080/watches" in the body provide details of multiple watches.
	   - To see all watches in the system, make a GET request ot this endpoint: "http://localhost:8080/watches".
	3) To register watches and count of them for the sale, use the endpoint: "http://localhost:8080/watchCountForSale", in the body provide details of watch and count of them for the sale.
	   - To see all watches in the sale and count of the, use the endpoint: "http://localhost:8080/watchCountForSale".
	4) User will have to register for the sale, So, to register for the sale, use the endpoint: "http://localhost:8080/registerUserForSale". In the body provide user details and for which watch and 		   sale he has opted.
	   - To see all the users registered for the sale, use the endpoint: "http://localhost:8080/getRegisteredUseForSale".
	5) To book a watch in the sale, use the endoint: "http://localhost:8080/bookWatch". In the body provide details of watch and user.
	
	- In the above endpoint, Point no: 1,2,3 will be used by the internal employee of the company.
- For example request, please refer to: "watch-flash-sale.postman_collection.json". You can import the in postman, and hit the server
