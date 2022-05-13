package br.unicamp_ic.inf335.trabalho2.trabalho2.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

//import br.unicamp.ic.inf335.beans.ProdutoBean;
import br.unicamp_ic.inf335.trabalho2.trabalho2.ProdutoBean;

class ProdutoBeanTest {

	    public static ArrayList<ProdutoBean> produtos = new ArrayList<ProdutoBean>();
		@Test
		void inicia() throws Exception {
			//ProdutoBean prod1 = new ProdutoBean(); // Teste com a classe vazia 
			//produtos.add(prod1);
			ProdutoBean prod1 = new ProdutoBean("001","TV 40K","TELEVISAO 40",4100.00,"DISP");
			produtos.add(prod1);
			ProdutoBean prod2 = new ProdutoBean("002","TV 50K","TELEVISAO 50",4000.00,"DISP");
			produtos.add(prod2);
			ProdutoBean prod3 = new ProdutoBean("003","TV 60K","TELEVISAO 60",4200.00,"DISP");
			produtos.add(prod3);
		}
		
	    @Test
	    
	    void testArraySize()
	    {
	    	assertEquals(3, produtos.size());
	    }
	    
	    @Test
		void compareTotest() {
			Collections.sort(produtos);
			//double vte[] = {}; // Teste com o vetor zero
		    double vte[] = {4000.00, 4100.00, 4200.00};
		    if (vte.length > 0 ) {
		    	for (int i=0; i< produtos.size(); i++) {
				System.out.println(produtos.get(i).getValor());
				double as1 = vte[i];
				System.out.println(as1);
				ProdutoBean valo1 = produtos.get(i);
				assertEquals(as1, valo1.getValor(),0.01);
		    	}
			}
		}
	}

