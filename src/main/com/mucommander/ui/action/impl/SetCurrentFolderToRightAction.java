/*
 * This file is part of muCommander, http://www.mucommander.com
 * Copyright (C) 2002-2012 Maxence Bernard
 *
 * muCommander is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * muCommander is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.mucommander.ui.action.impl;

import com.mucommander.ui.action.ActionDescriptor;
import com.mucommander.ui.action.MuAction;
import com.mucommander.ui.main.MainFrame;

import java.util.Map;

public class SetCurrentFolderToRightAction extends SetCurrentFolderAction {

    SetCurrentFolderToRightAction(MainFrame mainFrame, Type type, Map<String, Object> properties) {
        super(mainFrame, type, properties);
    }

    @Override
    public void performAction() {
        mainFrame.setLeftToRightFolder();
    }

    @Override
    public ActionDescriptor getDescriptor() {
        return new Descriptor();
    }

    public static final class Descriptor extends SetCurrentFolderAction.Descriptor {

        public static final String ACTION_ID = "SetCurrentFolderToRight";

        @Override
        public String getId() {
            return ACTION_ID;
        }

        @Override
        public MuAction createAction(MainFrame mainFrame, Map<String, Object> properties) {
            return new SetCurrentFolderToRightAction(mainFrame, Type.LEFT_TO_RIGHT, properties);
        }

    }

}
