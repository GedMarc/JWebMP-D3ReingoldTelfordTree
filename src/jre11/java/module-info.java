module com.jwebmp.plugins.d3.reingoldtilfordtree {
	exports com.jwebmp.plugins.d3.reingoldtilfordtree;
	exports com.jwebmp.plugins.d3.radialreingoldtilfordtree;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.d3.radialreingoldtilfordtree.D3ReingoldTilfordTreePageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.d3.reingoldtilfordtree.implementations.D3ReingoldTreeExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.d3.reingoldtilfordtree.implementations.D3ReingoldTreeExclusionsModule;

	opens com.jwebmp.plugins.d3.radialreingoldtilfordtree to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.d3.reingoldtilfordtree to com.fasterxml.jackson.databind, com.jwebmp.core;
}
