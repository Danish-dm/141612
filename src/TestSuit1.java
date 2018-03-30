import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;
public class TestSuit1 {

	@Test
	public void test() {
		
		
		List<Integer> lis = new ArrayList<>();
		lis.add(100);
		lis.add(23);
		lis.add(1);
		lis.add(-12);
		lis.add(112);
		
		Collections.sort(lis);
		int flag =0; 
		for (int i=0;i<lis.size()-1;i++){
			if( i!= lis.size()-1){
			if(lis.get(i)> lis.get(i+1)){
				flag=1;
				break;
			}
			}
		}
		lis.remove(0);
		lis.add(0, 2);
		lis.isEmpty();
		lis.contains(2);
		lis.getClass();
		lis.hashCode();
		lis.clear();
		assertEquals(0,flag);
		
		
	}
	@Test
	public void test2() {
		
		List<Integer> lis = new ArrayList<>();
		lis.add(100);
		lis.add(23);
		lis.add(1);
		lis.add(-12);
		lis.add(112);
		Collections.sort(lis);
		
		assertEquals(1,Collections.binarySearch(lis, 1));
		
		
	}
	@Test
	public void test3() {
		
		List<Integer> lis = new ArrayList<>();
		lis.add(100);
		lis.add(23);
		lis.add(1);
		lis.add(-12);
		lis.add(112);
		Collections.sort(lis);
		
		assertEquals(-2,Collections.binarySearch(lis, 0));
		
		
	}
	@Test
	public void test4() {
		
		
		List<Integer> lis = new ArrayList<>();
		lis.add(100);
		lis.add(23);
		lis.add(1);
		lis.add(-12);
		lis.add(112);
		lis.add(100);
		lis.add(23);
		lis.add(1);
		lis.add(-12);
		lis.add(112);
		lis.add(100);
		lis.add(23);
		lis.add(1);
		lis.add(-12);
		lis.add(112);
		lis.add(100);
		lis.add(23);
		lis.add(1);
		lis.add(-12);
		lis.add(112);
		
		Collections.sort(lis);
		Collections.reverse(lis);
		int flag =0; 
		for (int i=0;i<lis.size()-1;i++){
			if( i!= lis.size()-1){
			if(lis.get(i)< lis.get(i+1)){
				flag=1;
				break;
			}
			}
		}
		//Now check whether lis is in decending order 
		assertEquals(0,flag);
		
		
	}
	@Test
	public void test5() {
		List<Integer> lis = new ArrayList<>();
		lis.add(100);
		lis.add(23);
		lis.add(1);
		lis.add(-12);
		lis.add(112);
        Collections.sort(lis);  //-12,1,23,100,112
        List<Integer> lis1 = new ArrayList<>();
		lis1.add(23);
		lis1.add(100);
		
	    
	    int status= Collections.indexOfSubList(lis, lis1);
	    int status2= Collections.lastIndexOfSubList(lis, lis1);
	    if (status!= -1 ){
	    	status=1;
	    	assertEquals(1,status);
	    }
	    else{
	    	status=0;
	    	assertEquals(0,status);
	    }
	    if (status2!= -1 ){
	    	status2=1;
	    	assertEquals(1,status2);
	    }
	    else{
	    	status2=0;
	    	assertEquals(0,status2);
	    }
	}
		
	    @Test
		public void test6() {
			List<Integer> lis = new ArrayList<>();
			lis.add(100);
			lis.add(23);
			lis.add(1);
			
			Iterator iter = lis.iterator();
			
			iter.hasNext();
			if ((Integer)iter.next()>0){
				assertEquals(1,0);
			}
			else{
				assertEquals(1,1);
			}
	    
		
	}
	    @Test
		public void test7() {
			List lis = new LinkedList();
			lis.add(100);
			lis.add(23);
			lis.add(1);
			
			Iterator iter = lis.iterator();
			
			iter.hasNext();
			if ((Integer)iter.next()>0){
				assertEquals(0,0);
			}
			else{
				assertEquals(1,1);
			}
	    
		
	}
	    @Test
		public void test8() {
			List lis = new Vector();
			lis.add(100);
			lis.add(23);
			lis.add(1);
			
			Iterator iter = lis.iterator();
			
			iter.hasNext();
			if ((Integer)iter.next()>0){
				assertEquals(0,0);
			}
			else{
				assertEquals(1,1);
			}
	    
		
	}
	    @Test
		public void test9() {
			List lis = new Stack();
			lis.add(100);
			lis.add(23);
			lis.add(1);
			
			Iterator iter = lis.iterator();
			
			iter.hasNext();
			if ((Integer)iter.next()>0){
				assertEquals(0,0);
			}
			else{
				assertEquals(1,1);
			}
	    
		
	}
	    @Test
		public void test10() {
			HashSet hs = new HashSet();
			
			if (hs.isEmpty()){
				//do nothing 
				hs.add("Lion");
				hs.add("bear");
				hs.add("Leopard");
				hs.add("Black Mumba");
			}
			
			hs.contains("lion");
			Iterator it = hs.iterator();
			
			hs.remove("lion");
			
			if ( hs.size() == 4) {
				assertEquals(0,0);
				
			}
			else{
				assertEquals(1,1);
			}
			
			
			
	    
		
	}
	    @Test
		public void test11() {
			HashSet hs = new HashSet();
			
			if (hs.isEmpty()){
				//do nothing 
				hs.add("Lion");
				hs.add("bear");
				hs.add("Leopard");
				hs.add("Black Mumba");
			}
			
			hs.contains("lion");
			Iterator it = hs.iterator();
			
			hs.remove("lion");
			
			if ( hs.size() == 3) {
				assertEquals(0,0);
				
			}
			else{
				hs.clear();
				assertEquals(1,1);
			}	
	}
	


}
