package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Brown Sugar");
        Product product2 = new Product("Best Quality Coffee");
        Product product3 = new Product("Set of 6 coffee cups");
        Product product4 = new Product("Coffee mill");
        Item item1 = new Item(product1, new BigDecimal(25), 4);
        Item item2 = new Item(product2, new BigDecimal(65), 2);
        Item item3 = new Item(product3, new BigDecimal(299), 2);
        Item item4 = new Item(product4, new BigDecimal(1399), 1);
        Item item5 = new Item(product2, new BigDecimal(65), 5);
        Item item6 = new Item(product3, new BigDecimal(299), 1);
        product1.getItemsProd().add(item1);
        product2.getItemsProd().add(item2);
        product2.getItemsProd().add(item5);
        product3.getItemsProd().add(item3);
        product3.getItemsProd().add(item6);
        product4.getItemsProd().add(item4);
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        item4.setProduct(product4);
        item5.setProduct(product2);
        item6.setProduct(product3);
        Invoice invoice1 = new Invoice("247/54/GJW/2022");
        Invoice invoice2 = new Invoice("181/13/GJW/2022");
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice2.getItems().add(item4);
        invoice2.getItems().add(item5);
        invoice2.getItems().add(item6);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);
        item4.setInvoice(invoice2);
        item5.setInvoice(invoice2);
        item6.setInvoice(invoice2);

        //When
        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);
        int id1 = invoice1.getId();
        int id2 = invoice2.getId();
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        productDao.save(product4);
        int id3 = product1.getId();
        int id4 = product2.getId();
        int id5 = product3.getId();
        int id6 = product4.getId();
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);
        itemDao.save(item5);
        itemDao.save(item6);
        int id7 = item1.getId();
        int id8 = item2.getId();
        int id9 = item3.getId();
        int id10 = item4.getId();
        int id11 = item5.getId();
        int id12 = item6.getId();

        //Then
        assertNotEquals(0, id1);
        assertNotEquals(0, id2);
        assertNotEquals(0, id3);
        assertNotEquals(0, id4);
        assertNotEquals(0, id5);
        assertNotEquals(0, id6);
        assertNotEquals(0, id7);
        assertNotEquals(0, id8);
        assertNotEquals(0, id9);
        assertNotEquals(0, id10);
        assertNotEquals(0, id11);
        assertNotEquals(0, id12);


        //CleanUp
        itemDao.deleteById(id7);
        itemDao.deleteById(id8);
        itemDao.deleteById(id9);
        itemDao.deleteById(id10);
        itemDao.deleteById(id11);
        itemDao.deleteById(id12);
        invoiceDao.deleteById(id1);
        invoiceDao.deleteById(id2);
        productDao.deleteById(id3);
        productDao.deleteById(id4);
        productDao.deleteById(id5);
        productDao.deleteById(id6);
    }
}