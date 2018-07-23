import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.d3.radialreingoldtilfordtree.D3ReingoldTilfordTreePageConfigurator;

module com.jwebmp.components.d3.reingoldtilfordtree {
	exports com.jwebmp.plugins.d3.reingoldtilfordtree;
	exports com.jwebmp.plugins.d3.radialreingoldtilfordtree;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;

	provides IPageConfigurator with D3ReingoldTilfordTreePageConfigurator;

}
