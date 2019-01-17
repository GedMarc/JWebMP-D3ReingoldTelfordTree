/*
 * Copyright (C) 2017 GedMarc
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
package com.jwebmp.plugins.d3.radialreingoldtilfordtree;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.d3.reingoldtilfordtree.JWReingoldTilfordTreeOptions;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * The implementation of the Radial ComponentFeatureBase
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */
public class D3RadialReingoldTilfordTreeFeature
		extends Feature<GlobalFeatures, JWReingoldTilfordTreeOptions, D3RadialReingoldTilfordTreeFeature>
{


	private final D3RadialReingoldTilfordTree myTree;
	private JWReingoldTilfordTreeOptions options = new JWReingoldTilfordTreeOptions();

	public D3RadialReingoldTilfordTreeFeature(D3RadialReingoldTilfordTree tree)
	{
		super("JWRadialReingoldTilfordTreeFeature");
		myTree = tree;
	}

	@Override
	public String toString()
	{
		return super.toString();
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

	/**
	 * Gets the options for this set
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JWReingoldTilfordTreeOptions getOptions()
	{
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{

		addQuery(myTree.getJQueryID() + "radialTree(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON);

	}

}
