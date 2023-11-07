package atelier01.inaya.atelier01springbootprojet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class ProduitsApplicationTests {
    @Autowired
    private ProduitRepository produitRepository;
    @Test
    public void testCreateProduit() {
        Produit prod = new Produit("PC Dell",2200.500,new Date());
        produitRepository.save(prod);
    }
}
