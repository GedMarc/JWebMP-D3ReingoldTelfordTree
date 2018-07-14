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
package com.jwebmp.components.d3.reingoldtilfordtree;

import com.jwebmp.Feature;

import javax.validation.constraints.NotNull;

import static com.jwebmp.utilities.StaticStrings.*;

/**
 * The implementation of the Radial ComponentFeatureBase
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
public class JWReingoldTilfordTreeFeature<J extends JWReingoldTilfordTreeFeature<J>>
		extends Feature<JWReingoldTilfordTreeOptions, J>
{

	private static final long serialVersionUID = 1L;
	private final JWReingoldTilfordTree myTree;
	private JWReingoldTilfordTreeOptions options = new JWReingoldTilfordTreeOptions();

	public JWReingoldTilfordTreeFeature(JWReingoldTilfordTree tree)
	{
		super("JWReingoldTilfordTreeFeature");
		myTree = tree;
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
		if (options == null)
		{
			options = new JWReingoldTilfordTreeOptions();
		}
		return options;
	}

	/**
	 * Set to a new round of data
	 * <p>
	 *
	 * @param options
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setOptions(JWReingoldTilfordTreeOptions options)
	{
		this.options = options;
		return (J) this;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(myTree.getJQueryID() + "reingoldTree(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON);
	}
}
