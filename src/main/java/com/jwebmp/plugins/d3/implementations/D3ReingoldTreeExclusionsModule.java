package com.jwebmp.plugins.d3.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class D3ReingoldTreeExclusionsModule
		implements IGuiceScanModuleExclusions<D3ReingoldTreeExclusionsModule>,
				           IGuiceScanJarExclusions<D3ReingoldTreeExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-d3-reigngold-tilford-tree-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.d3.reingoldtilfordtree");
		return strings;
	}
}
