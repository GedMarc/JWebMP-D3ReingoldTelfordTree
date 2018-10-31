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
package com.jwebmp.plugins.d3.reingoldtilfordtree;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * An interactive version of the Reingold–Tilford Tree
 * <p>
 *
 * @param <J>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "Reingold-Tilford Tree",
		description = "A D3 generated dynamically placed tree based on values and space available",
		url = "https://sourceforge.net/p/jwebswing/jqd3/")
public class JWReingoldTilfordTree<J extends JWReingoldTilfordTree<J>>
		extends Div
{


	private JWReingoldTilfordTreeFeature feature;

	public JWReingoldTilfordTree()
	{
		feature = new JWReingoldTilfordTreeFeature(this);
		addFeature(feature);

	}

	@Override
	public JWReingoldTilfordTreeOptions getOptions()
	{
		return getFeature().getOptions();
	}

	public JWReingoldTilfordTreeFeature getFeature()
	{
		return feature;
	}

	public void setFeature(JWReingoldTilfordTreeFeature feature)
	{
		this.feature = feature;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
