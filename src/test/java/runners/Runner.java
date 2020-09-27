package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//senaryolarimizi calistirabilmek icin
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports"},//html formatinda rapor olusturmak icin
        features = "src/test/resources/features",//senaryolarimizin icinde bulundugu features klasorunun adresi
        glue = "stepdefinitions",//test adimlarinin methodlarinin bulundugu paketin ismi yazilir
        tags = "@ebay",//calistirmak istedigimiz feature veya senaryonun @tag ismini yaziyoruz
        dryRun = false //senaryolarimizin icindeki adimlara ait herhangi bir eksik method varsa bu methodlari console dan kopyalamak
                      //icin dryRun=true yapiyoruz. Boylece testler calismaz sadece eksik methodlar gosterilir
                      //dryRun=false dersek bu defa testlerimiz calisir
)

public class Runner {
}
