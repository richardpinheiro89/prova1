package br.unicamp_ic.inf335.trabalho2.trabalho2.test;

import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import br.unicamp_ic.inf335.trabalho2.trabalho2.AnuncianteBean;
import br.unicamp_ic.inf335.trabalho2.trabalho2.AnuncioBean;
import br.unicamp_ic.inf335.trabalho2.trabalho2.ProdutoBean;


class AnuncianteBeanTest {

	public static ArrayList<AnuncianteBean> anunciantes;
	public ArrayList<AnuncioBean> anuncio1;
	public static ArrayList<AnuncioBean> anuncioList;
	public static ArrayList<ProdutoBean> produtos = new ArrayList<ProdutoBean>();
	
	@Test
	void valorMedioAnunciosTest() throws MalformedURLException{
		
		  ProdutoBean prod1 = new ProdutoBean("001","TV 40K","TELEVISAO 40",4100.00,"DISP");
		  produtos.add(prod1);
		  ProdutoBean prod2 = new ProdutoBean("002","TV 50K","TELEVISAO 50",4000.00,"DISP");
		  produtos.add(prod2);
		  ProdutoBean prod3 = new ProdutoBean("003","TV 60K","TELEVISAO 60",4200.00,"DISP");
		  produtos.add(prod3);
		  Collections.sort(produtos);
		  anuncioList = new ArrayList<AnuncioBean>();
		  URL foto1 = new URL("http://dev.com/foto1.jpg");
		  URL foto2 = new URL("http://dev.com/foto2.jpg");
		  URL foto3 = new URL("http://dev.com/foto3.jpg");
		  ArrayList<URL> FotoList = new ArrayList<>();
		  FotoList.add(foto1);
		  FotoList.add(foto2);
		  FotoList.add(foto3);
		  double vte[] = {0.1, 0.2, 0.3};
		  if (vte.length > 0) {
			  for (int i=0; i< produtos.size(); i++) {
				  AnuncioBean anuncio = new AnuncioBean(produtos.get(i), FotoList, vte[i]);
				  anuncioList.add(anuncio);
			  }
		  }
		
		
		AnuncianteBean bank = new AnuncianteBean("ZECA","12345",anuncioList);
		//AnuncianteBean bank = new AnuncianteBean();
		double var02 = 3273.33;;
		if (var02 == 0) {
			throw new ArithmeticException("divisao por zero");
		}
		assertEquals(var02, bank.valorMedioAnuncios(),0.1);
		
	}
	
	@Test
    void testArraySizeAnunciante()
    {
    	assertEquals(3, anuncioList.size());
    }
}

