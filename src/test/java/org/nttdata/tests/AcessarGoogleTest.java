package org.nttdata.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcessarGoogleTest {

    @Test
    public void googleSearch() throws InterruptedException {
        // Criar uma instância do WebDriver
        WebDriver driver = new ChromeDriver();

        // Acessar o Google
        driver.get("https://www.google.com");

        //Digitar na barra de pesquisa
        driver.findElement(By.name("q")).sendKeys("Hello Selenium!");

        //Pressionar Enter
        driver.findElement(By.xpath("//textarea[@title='Pesquisar']")).sendKeys(Keys.ENTER);

        //Esperar 1 segundo para visualizar troca de página
        Thread.sleep(1000);

        // Fechar o navegador
        driver.quit();
    }
}