package pkgCore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

import antlr.collections.List;
import pkgEnum.eGameType;

public class TableTest {
	
	@Test
	public void addPlayerTest() {
		Table t = new Table();
		Player p1 = new Player("Player 1", 1);
		Player p2 = new Player("Player 2", 2);
		Player p3 = new Player("Player 3", 3);
		t.AddPlayerToTable(p1);
		t.AddPlayerToTable(p2);
		t.AddPlayerToTable(p3);
		
		assertNotNull(t);
		
		Player pGet = t.GetPlayerFromTable(p1);
		
		assertNotNull(pGet);
		assertEquals(p1,pGet);
		
		t.ClearTable();
		assertEquals(0,t.GetTablePlayers().size());
		
		t.AddPlayerToTable(p1);
		ArrayList<Player> lstPlayer = t.GetTablePlayers();
		assertEquals (1, lstPlayer.size());
		
		Table t1 = new Table();
		
		t1.AddPlayerToTable(p1);
		t1.AddPlayerToTable(p2);
		t1.AddPlayerToTable(p3);
		
		assertNotNull(t1);
		
		ArrayList<Player> lstPlayer1 = t1.GetTablePlayers();
		
		assertEquals(3,lstPlayer1.size());
		
		t1.RemovePlayerFromTable(p3);
		
		ArrayList<Player> lstPlayer2 = t1.GetTablePlayers();
		
		assertEquals(2,lstPlayer2.size());
	}
		
	@Test
	public void TestTableDeck() {
	
	
		Table t = new Table();
		assertNotNull(t);
		
		t.CreateDeck(eGameType.BLACKJACK);
		
		assertNotNull(t.getTableDeck());
		
		assertEquals(52 * 6, t.getTableDeck().getiDeckCount());
		
	}
		
		/*t=null;
		assertEquals(t);
		
		assertEquals(t.GetPlayerFromTable(p1), p1);
		assertEquals(t.GetPlayerFromTable(p2), p2);
		assertEquals(t.GetPlayerFromTable(p3), p3);
	
		t.RemovePlayerFromTable(p1);
		t.RemovePlayerFromTable(p2);
		t.RemovePlayerFromTable(p3);
		
		assertEquals(t.GetPlayerFromTable(p1), null);
		assertEquals(t.GetPlayerFromTable(p2), null);
		assertEquals(t.GetPlayerFromTable(p3), null);*/
		
		
		
	}
	
	


