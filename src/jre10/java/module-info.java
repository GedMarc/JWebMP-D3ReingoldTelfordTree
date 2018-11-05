import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.d3.implementations.D3ReingoldTreeExclusionsModule;
import com.jwebmp.plugins.d3.radialreingoldtilfordtree.D3ReingoldTilfordTreePageConfigurator;

module com.jwebmp.plugins.d3.reingoldtilfordtree {
	exports com.jwebmp.plugins.d3.reingoldtilfordtree;
	exports com.jwebmp.plugins.d3.radialreingoldtilfordtree;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with D3ReingoldTilfordTreePageConfigurator;

	provides IGuiceScanJarExclusions with D3ReingoldTreeExclusionsModule;
	provides IGuiceScanModuleExclusions with D3ReingoldTreeExclusionsModule;

	opens com.jwebmp.plugins.d3.radialreingoldtilfordtree to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.d3.reingoldtilfordtree to com.fasterxml.jackson.databind, com.jwebmp.core;
}
