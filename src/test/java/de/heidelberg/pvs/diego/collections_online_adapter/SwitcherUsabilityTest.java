package de.heidelberg.pvs.diego.collections_online_adapter;

import java.util.List;

import org.junit.Test;

import de.heidelberg.pvs.diego.collections_online_adapter.context.CollectionTypeEnum;
import de.heidelberg.pvs.diego.collections_online_adapter.context.ListAllocationContext;
import de.heidelberg.pvs.diego.collections_online_adapter.context.impl.FirstSamplesListAllocationContext;

public class SwitcherUsabilityTest {

	List<Integer> list;
	
	
	@Test
	public void testWithContext() throws Exception {
		ListAllocationContext<Integer> context = new FirstSamplesListAllocationContext<Integer>(CollectionTypeEnum.ARRAY);
		list = context.createList();
		
	}
	
}