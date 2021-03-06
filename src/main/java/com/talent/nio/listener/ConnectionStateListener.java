/*
 * Copyright (c) 2013, OpenCloudDB/MyCAT and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software;Designed and Developed mainly by many Chinese 
 * opensource volunteers. you can redistribute it and/or modify it under the 
 * terms of the GNU General Public License version 2 only, as published by the
 * Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 * Any questions about this component can be directed to it's project Web address 
 * https://code.google.com/p/opencloudb/.
 *
 */
package com.talent.nio.listener;

import com.talent.nio.communicate.ChannelContext;

/**
 * 
 * @filename:	 com.talent.nio.listener.ConnectionStateListener
 * @copyright:   Copyright (c)2010
 * @company:     talent
 * @author:      谭耀武
 * @version:     1.0
 * @create time: 2013年12月18日 下午4:55:19
 * @record
 * <table cellPadding="3" cellSpacing="0" style="width:600px">
 * <thead style="font-weight:bold;background-color:#e3e197">
 * 	<tr>   <td>date</td>	<td>author</td>		<td>version</td>	<td>description</td></tr>
 * </thead>
 * <tbody style="background-color:#ffffeb">
 * 	<tr><td>2013年12月18日</td>	<td>谭耀武</td>	<td>1.0</td>	<td>create</td></tr>
 * </tbody>
 * </table>
 */
public interface ConnectionStateListener
{
	/**
	 * 未连接
	 * @param channelContext
	 */
	void onTcpOff(ChannelContext channelContext) throws Exception;

	/**
	 * TCP正在建链
	 * @param channelContext
	 */
	void onTcpBuilding(ChannelContext channelContext) throws Exception;

	/**
	 * TCP层已经连上链路
	 * @param channelContext
	 * @throws Exception 
	 */
	void onTcpOn(ChannelContext channelContext) throws Exception;

	/**
	 * TCP建链失败
	 * @param channelContext
	 */
	void onTcpLinkFailed(ChannelContext channelContext) throws Exception;

	/**
	 * 应用层链路断开
	 * @param channelContext
	 */
	void onAppOff(ChannelContext channelContext) throws Exception;

	/**
	 * 应用层正在建链
	 * @param channelContext
	 */
	void onAppBuilding(ChannelContext channelContext) throws Exception;

	/**
	 * 应用层已经连上链路
	 * @param channelContext
	 */
	void onAppOn(ChannelContext channelContext) throws Exception;

	/**
	 * 应用层建链失败
	 * @param channelContext
	 */
	void onAppLinkFailed(ChannelContext channelContext) throws Exception;

	/**
	 * 正在注销链路
	 * @param channelContext
	 */
	void onLogouting(ChannelContext channelContext) throws Exception;
	
	void onRemoved(ChannelContext channelContext) throws Exception;
}