package com.bilgeadam.lesson016.polimorfizm;

import java.util.Random;

/*
 * 1 - abstract kalıtım yoluylar(extends) aktarılan bir sınıf ve jaba tek bir sınıftan kalıtıma izin veriyor.
 * 1 - interface implements edilerek metotların alt sınıfkara aktarılması birden fazla interface implemente edilebilir.
 * (kalıtım yoluyla olusturamadıgımız ortak davranısları abstrac yerine interfaceler uzerinden implemente ederiz)
 * 
 * 2- abstract sınıflar içerisinde govdeli govdesiz metotlar ve ozellikler tutabilir.
 * 2- interface içerisinde genelde govdesiz metotlar tutulur.
 * 
 * 
 * 
 * 
 */

public class Runner {

	public static void main(String[] args) {

		Kullanici kullanici = new Kullanici("Caner");
		Pokemon atesPokemonu = new AtesPokemonu(1, "charizard", 2000, 300, 3, 1500);
		Pokemon suPokemonu = new SuPokemonu(2, "squirtle", 500, 100, 2, 250, 368); suPokemonu = new SuPokemonu(2, "squirtle", 500, 100, 2, 250, 368);
		Pokemon elektrikPokemonu = new ElektrikPokemonu(3, "pikhachu", 180, 200, 2, 1280);
		
		((AtesPokemonu)atesPokemonu).getYakicilikGucu(); // Pokemondan olduğu için kendi özelliklerine bu şekilde ulaşıyoruz..
		
		Pokemon [] pokemonlar = {atesPokemonu,suPokemonu,elektrikPokemonu};
		kullanici.setPokemonlar(pokemonlar);
		
		System.out.println(kullanici);
		Pokemon pokemon = pokemonSec(pokemonlar);
		saldir(pokemon);
		
		
		
	}
	
	
	
	
	public static void saldir(Pokemon pokemon) {
	
		pokemon.saldir();
	}
	
	
	public static void saldir2(Pokemon pokemon) {
		
		if(pokemon instanceof AtesPokemonu) {
			System.out.println(pokemon.getAd()+" adlı pokemon ates saldırısı yapıyor.");
		}else if(pokemon instanceof SuPokemonu){
			System.out.println(pokemon.getAd()+" adlı pokemon su saldırısı yapıyor.");
		}else {
			System.out.println(pokemon.getAd()+" adlı pokemon elektrik saldırısı yapıyor.");
		}
	}
	
	
	public static Pokemon pokemonSec(Pokemon[] pokemonlar) {
		
		Random random = new Random();
		int index = random.nextInt(pokemonlar.length);
		return pokemonlar[index];
	}
}
