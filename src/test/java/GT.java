import ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO;
import ee.ut.math.tvt.salessystem.dataobjects.SoldItem;
import ee.ut.math.tvt.salessystem.dataobjects.StockItem;
import ee.ut.math.tvt.salessystem.logic.ShoppingCart;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GT {

  @Test(timeout = 4000)
  public void testAddItem()  throws Throwable  {
      InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
      ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
      shoppingCart0.addItem((SoldItem) null);
      shoppingCart0.submitCurrentPurchase();
  }

  @Test(timeout = 4000)
  public void testCreatesShoppingCart()  throws Throwable  {
      InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
      ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
      shoppingCart0.submitCurrentPurchase();
  }

  @Test(timeout = 4000)
  public void testCancelCurrentPurchase()  throws Throwable  {
      InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
      ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
      shoppingCart0.cancelCurrentPurchase();
  }

  @Test(timeout = 4000)
  public void testGetAll()  throws Throwable  {
      InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
      ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
      List<SoldItem> list0 = shoppingCart0.getAll();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void testGetQuantity()  throws Throwable  {
      StockItem stockItem0 = new StockItem();
      int int0 = stockItem0.getQuantity();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void testSetName()  throws Throwable  {
      Long long0 = Long.valueOf(899L);
      StockItem stockItem0 = new StockItem(long0, "", "}$", 899L, 204);
      assertEquals("", stockItem0.getName());

      stockItem0.setName("}$");
      assertEquals(899.0, stockItem0.getPrice(), 0.01);
  }

  @Test(timeout = 4000)
  public void testGetDescription()  throws Throwable  {
      Long long0 = Long.valueOf(899L);
      StockItem stockItem0 = new StockItem(long0, "", "}$", 899L, 204);
      String string0 = stockItem0.getDescription();
      assertEquals("}$", string0);
      assertEquals(899.0, stockItem0.getPrice(), 0.01);
      assertEquals(204, stockItem0.getQuantity());
      assertEquals("", stockItem0.getName());
  }

  @Test(timeout = 4000)
  public void testSetQuantity()  throws Throwable  {
      Long long0 = Long.valueOf(899L);
      StockItem stockItem0 = new StockItem(long0, "", "}$", 899L, 204);
      stockItem0.setQuantity(0);
      assertEquals(0, stockItem0.getQuantity());
  }

  @Test(timeout = 4000)
  public void testSetPrice()  throws Throwable  {
      Long long0 = Long.valueOf(899L);
      StockItem stockItem0 = new StockItem(long0, "", "}$", 899L, 204);
      stockItem0.setPrice(899L);
      assertEquals(204, stockItem0.getQuantity());
      assertEquals("}$", stockItem0.getDescription());
      assertEquals("", stockItem0.getName());
      assertEquals(899.0, stockItem0.getPrice(), 0.01);
  }

  @Test(timeout = 4000)
  public void testSetDescription()  throws Throwable  {
      StockItem stockItem0 = new StockItem();
      stockItem0.setDescription("");
      assertNull(stockItem0.getName());
  }

  @Test(timeout = 4000)
  public void testGetPrice()  throws Throwable  {
      StockItem stockItem0 = new StockItem();
      double double0 = stockItem0.getPrice();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void testToString()  throws Throwable  {
      StockItem stockItem0 = new StockItem();
      String string0 = stockItem0.toString();
      assertEquals("StockItem{id=null, name='null'}", string0);
  }

  @Test(timeout = 4000)
  public void testGetName()  throws Throwable  {
      Long long0 = new Long((-1L));
      StockItem stockItem0 = new StockItem(long0, "Wwy9A@H})v@8M0i=", "27rLT|c6/]0`j", (-969.36265721), 1);
      stockItem0.getName();
      assertEquals((-969.36265721), stockItem0.getPrice(), 0.01);
      assertEquals(1, stockItem0.getQuantity());
  }

  @Test(timeout = 4000)
  public void testSetId()  throws Throwable  {
      Long long0 = Long.valueOf(899L);
      StockItem stockItem0 = new StockItem(long0, "", "}$", 899L, 204);
      stockItem0.setId(long0);
      assertEquals("}$", stockItem0.getDescription());
      assertEquals("", stockItem0.getName());
      assertEquals(899.0, stockItem0.getPrice(), 0.01);
      assertEquals(204, stockItem0.getQuantity());
  }

  @Test(timeout = 4000)
  public void testGetId()  throws Throwable  {
      Long long0 = Long.valueOf(899L);
      StockItem stockItem0 = new StockItem(long0, "", "}$", 899L, 204);
      stockItem0.getId();
      assertEquals("}$", stockItem0.getDescription());
      assertEquals(204, stockItem0.getQuantity());
      assertEquals(899.0, stockItem0.getPrice(), 0.01);
      assertEquals("", stockItem0.getName());
  }

  @Test(timeout = 4000)
  public void testSaveSoldItem()  throws Throwable  {
      InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
      SoldItem soldItem0 = new SoldItem();
      inMemorySalesSystemDAO0.saveSoldItem(soldItem0);
      assertNull(soldItem0.getId());
  }

  @Test(timeout = 4000)
  public void testSaveStockItem()  throws Throwable  {
      InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
      Long long0 = new Long(0L);
      StockItem stockItem0 = new StockItem(long0, "", "", 0L, (-1));
      inMemorySalesSystemDAO0.saveStockItem(stockItem0);
      StockItem stockItem1 = inMemorySalesSystemDAO0.findStockItem(0L);
      assertEquals((-1), stockItem1.getQuantity());
      assertNotNull(stockItem1);
  }

  @Test(timeout = 4000)
  public void testFindStockItemReturningNull()  throws Throwable  {
      InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
      StockItem stockItem0 = inMemorySalesSystemDAO0.findStockItem(0L);
      assertNull(stockItem0);
  }

  @Test(timeout = 4000)
  public void testFindStockItems()  throws Throwable  {
      InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
      List<StockItem> list0 = inMemorySalesSystemDAO0.findStockItems();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void testCommitTransaction()  throws Throwable  {
      InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
      inMemorySalesSystemDAO0.commitTransaction();
  }

  @Test(timeout = 4000)
  public void testRollbackTransaction()  throws Throwable  {
      InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
      inMemorySalesSystemDAO0.rollbackTransaction();
  }

  @Test(timeout = 4000)
  public void testBeginTransaction()  throws Throwable  {
      InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
      inMemorySalesSystemDAO0.beginTransaction();
  }
}
