package com.bilgeadam.lesson029;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SerializationTest {

	public static void main(String[] args) {
		Movie movie = new Movie("Seven", "Drama", LocalDate.of(1995, 05, 05));
		Movie movie3 = new Movie("Pulp Fiction", "Drama", LocalDate.of(1994, 05, 05));

		List<Movie> movieList = new ArrayList<>(List.of(movie, movie3));

		;
		
		serializationList2(movieList);
		
		List<Movie> yeniListe2 = deserializationList2();
		
		if (yeniListe2.isEmpty()) {
			System.out.println("Başarısız");
		}else {
			yeniListe2.forEach(System.out::println);
		}
		
		//serializationList(movieList)
		
//		List<Movie> yeniListe = deserializationList();
//		
//		if (yeniListe.isEmpty()) {
//			System.out.println("Başarısız");
//		}else {
//			yeniListe.forEach(System.out::println);
//		}
		

		// serialization(movie);

//		Optional<Movie> movie2 = deserialization();
//		if(movie2.isEmpty()) {
//			System.out.println("deserilize işlemi başarısız!!!..");
//		}else {
//			System.out.println("deserilize işlemi başarılı");
//			System.out.println(movie2.get());
//		}

	}
	
	
	
	public static void serializationList2(List<Movie> movieList) {
		
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					new FileOutputStream("C:/java10-workspace/dosya/seri3.txt"))) {
			
			
			objectOutputStream.writeObject(movieList);
			System.out.println("Sterilize işlemi başarılı");
			
		} catch (FileNotFoundException e) {
			System.out.println("Sterilize işlemi başarısız");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Sterilize işlemi başarısız");
			e.printStackTrace();
		}
	}
	
	public static List<Movie> deserializationList2(){
		
		List<Movie> list = new ArrayList<>();
		
		try(ObjectInputStream objectInputStream =
				new ObjectInputStream(new FileInputStream("C:/java10-workspace/dosya/seri3.txt"))) {
			
			list =(List<Movie>) objectInputStream.readObject();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
            

	public static void serializationList(List<Movie> movieList) {

		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new FileOutputStream("C:/java10-workspace/dosya/seri2.txt"))) {

			for (Movie movie : movieList) {
				objectOutputStream.writeObject(movie);

			}
			System.out.println("Liste serileştirme işlemi başarılır");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static List<Movie> deserializationList() {

		List<Movie> moviList = new ArrayList<>();
		try (ObjectInputStream objectInputStream = new ObjectInputStream(
				new FileInputStream("C:/java10-workspace/dosya/seri2.txt"))) {

			Movie movie = null;
			
			while((movie = (Movie) objectInputStream.readObject()) != null) {
				moviList.add(movie);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Bütün veriler okundu");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return moviList;
	}

	public static void serialization(Movie movie) {

		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new FileOutputStream("C:/java10-workspace/dosya/seri.txt"))) {

			objectOutputStream.writeObject(movie);
			System.out.println("Serileştirme işlemi başarılı");

		} catch (FileNotFoundException e) {
			System.out.println("Serileştirme işlemi başarısız!!!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Serileştirme işlemi başarısız!!!");
			e.printStackTrace();
		}
	}

	public static Optional<Movie> deserialization() {

		Movie movie = null;

		try (ObjectInputStream objectInputStream = new ObjectInputStream(
				new FileInputStream("C:/java10-workspace/dosya/seri.txt"))) {

			movie = (Movie) objectInputStream.readObject();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		return Optional.ofNullable(movie);
	}

}
