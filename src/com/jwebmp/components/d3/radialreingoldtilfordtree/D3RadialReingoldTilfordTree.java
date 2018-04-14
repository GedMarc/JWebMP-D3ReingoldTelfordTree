/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.components.d3.radialreingoldtilfordtree;

import com.jwebmp.base.html.Div;
import com.jwebmp.base.html.attributes.NoAttributes;
import com.jwebmp.base.html.interfaces.children.NoChildren;
import com.jwebmp.base.html.interfaces.events.NoEvents;
import com.jwebmp.components.d3.reingoldtilfordtree.JWReingoldTilfordTreeOptions;
import com.jwebmp.plugins.ComponentInformation;

/**
 * The implementation of the radial Reingold Tilford Tree.
 * <p>
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "Radial Reingold-Tilford Tree",
		description = "A D3 generated dynamically placed tree based on values and space available in a radial fashion",
		url = "https://sourceforge.net/p/jwebswing/jqd3/")
public class D3RadialReingoldTilfordTree
		extends Div<NoChildren, NoAttributes, D3RadialReingoldTilfordTreeFeature, NoEvents, D3RadialReingoldTilfordTree>
{

	private static final long serialVersionUID = 1L;
	private D3RadialReingoldTilfordTreeFeature feature;

	/**
	 * Constructs a new Tilford Tree
	 */
	public D3RadialReingoldTilfordTree()
	{
		super();

		addFeature(getFeature());
	}

	public D3RadialReingoldTilfordTreeFeature getFeature()
	{
		if (feature == null)
		{
			feature = new D3RadialReingoldTilfordTreeFeature(this);
		}
		return feature;
	}

	public void setFeature(D3RadialReingoldTilfordTreeFeature feature)
	{
		this.feature = feature;
	}

	@Override
	public JWReingoldTilfordTreeOptions getOptions()
	{
		return getFeature().getOptions();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
