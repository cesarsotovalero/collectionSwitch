package de.heidelberg.pvs.diego.collections_online_adapter.context;

import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import de.heidelberg.pvs.diego.collections_online_adapter.context.impl.SetAllocationContextImpl;
import de.heidelberg.pvs.diego.collections_online_adapter.optimizers.AllocationOptimizer;
import de.heidelberg.pvs.diego.collections_online_adapter.optimizers.PassiveOptimizer;

public class SetAllocationContextImplTest {
	
	@Test
	public void sanityTest() throws Exception {

		// Optimizer
		AllocationOptimizer optimizer = new PassiveOptimizer(10);
		
		// Context
		SetAllocationContext context = new SetAllocationContextImpl(optimizer);
		Assert.assertNotNull(context);
		
		optimizer.setContext(context);
		
		Set<Integer> set = context.createSet();
		Assert.assertNotNull(set);
		
	}
	

}