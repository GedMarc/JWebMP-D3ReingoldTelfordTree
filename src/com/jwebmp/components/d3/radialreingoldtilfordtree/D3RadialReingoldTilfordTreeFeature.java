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

import com.jwebmp.Feature;
import com.jwebmp.components.d3.reingoldtilfordtree.JWReingoldTilfordTreeOptions;

import static com.jwebmp.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * The implementation of the Radial ComponentFeatureBase
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
public class D3RadialReingoldTilfordTreeFeature
		extends Feature<JWReingoldTilfordTreeOptions, D3RadialReingoldTilfordTreeFeature>
{

	private static final long serialVersionUID = 1L;
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

	/**
	 * Set to a new round of data
	 * <p>
	 *
	 * @param options
	 */
	@Override
	public void setOptions(JWReingoldTilfordTreeOptions options)
	{
		this.options = options;
	}

	@Override
	public void assignFunctionsToComponent()
	{

		addQuery(myTree.getJQueryID() + "radialTree(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON);

	}


}
