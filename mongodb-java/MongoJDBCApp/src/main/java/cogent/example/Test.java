package cogent.example;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


public class Test {
	
	   
	   

	public static void main(String[] args) {
		MongoClient mongo = MongoClients.create("mongodb://127.0.0.1:27017");
		 
//		MongoCredential credential; 
//		
//	      credential = MongoCredential.createCredential("nitin", "nitindb", 
//	         "password".toCharArray()); 
		MongoDatabase database = mongo.getDatabase("nitindb");
		MongoCollection<Document> collection = database.getCollection("employee");
		FindIterable<Document> iterDoc = collection.find();

		Iterator<Document> it = iterDoc.iterator();
		// System.out.println("hello");
//		Document d = new Document();
//		d.append("_id", 3);
//		d.append("name", "David");
//		d.append("salary", 11111.11);
//		collection.insertOne(d);
		while (it.hasNext()) {
			Document d = it.next();
			
			//System.out.println(d.toJson());
			String name=d.getString("name");
			int id = d.getInteger("_id");
			double salary = d.getDouble("salary");
			System.out.println(id + ":" + name + ":" + salary);
			;
//		
			
		
		}
	}

}
