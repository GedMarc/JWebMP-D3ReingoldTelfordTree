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

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.core.htmlbuilder.javascript.JavascriptPartType;

import java.util.ArrayList;
import java.util.List;

/**
 * A unique item in the radial tree
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 30 Aug 2015
 */
public class D3RadialTreeItem
		extends JavaScriptPart
{

	private String name;
	private List<D3RadialTreeItem> children;

	public D3RadialTreeItem()
	{
		this("");
	}

	/**
	 * Sets a header with a children item
	 * <p>
	 *
	 * @param name
	 */
	public D3RadialTreeItem(String name)
	{
		this.name = name;
	}

	/**
	 * Returns the items name
	 * <p>
	 *
	 * @return
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the items name
	 * <p>
	 *
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public JavascriptPartType getJavascriptType()
	{
		return JavascriptPartType.JSON;
	}

	public D3RadialTreeItem add(String item)
	{
		D3RadialTreeItem newItem = new D3RadialTreeItem(item);
		getChildren().add(newItem);
		return newItem;
	}

	/**
	 * Returns the tree's children items
	 * <p>
	 *
	 * @return
	 */
	public List<D3RadialTreeItem> getChildren()
	{
		if (children == null)
		{
			children = new ArrayList<>();
		}
		return children;
	}

	/**
	 * Sets this items children
	 * <p>
	 *
	 * @param children
	 */
	public void setChildren(List<D3RadialTreeItem> children)
	{
		this.children = children;
	}

	public D3RadialTreeItem add(D3RadialTreeItem item)
	{
		getChildren().add(item);
		return item;
	}

}
