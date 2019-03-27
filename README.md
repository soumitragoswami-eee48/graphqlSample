To test the GraphQL api, hit the following end points:
1)
http://localhost:8080/rest/books- POST 
with request body(the graphQL query) in plain text (not JSON) such as :
{
  allBooks{
	isn
	title
	publisher
	authors
	publishedDate
  }

}
***Only mention the required fields and the response will change based on that***


