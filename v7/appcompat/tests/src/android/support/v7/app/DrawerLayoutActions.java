/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.support.v7.app;

import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;

import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.support.v4.widget.DrawerLayout;
import android.view.View;

import org.hamcrest.Matcher;

public class DrawerLayoutActions {
    /**
     * Opens the drawer at the specified edge gravity.
     */
    public static ViewAction openDrawer(final int drawerEdgeGravity) {
        return new ViewAction() {
            @Override
            public Matcher<View> getConstraints() {
                return isAssignableFrom(DrawerLayout.class);
            }

            @Override
            public String getDescription() {
                return "Opens the drawer";
            }

            @Override
            public void perform(UiController uiController, View view) {
                uiController.loopMainThreadUntilIdle();

                DrawerLayout drawerLayout = (DrawerLayout) view;
                drawerLayout.openDrawer(drawerEdgeGravity);

                // Wait for a full second to let the inner ViewDragHelper complete the operation
                uiController.loopMainThreadForAtLeast(1000);
            }
        };
    }

    /**
     * Opens the drawer.
     */
    public static ViewAction openDrawer(final View drawerView) {
        return new ViewAction() {
            @Override
            public Matcher<View> getConstraints() {
                return isAssignableFrom(DrawerLayout.class);
            }

            @Override
            public String getDescription() {
                return "Opens the drawer";
            }

            @Override
            public void perform(UiController uiController, View view) {
                uiController.loopMainThreadUntilIdle();

                DrawerLayout drawerLayout = (DrawerLayout) view;
                drawerLayout.openDrawer(drawerView);

                // Wait for a full second to let the inner ViewDragHelper complete the operation
                uiController.loopMainThreadForAtLeast(1000);
            }
        };
    }

    /**
     * Closes the drawer at the specified edge gravity.
     */
    public static ViewAction closeDrawer(final int drawerEdgeGravity) {
        return new ViewAction() {
            @Override
            public Matcher<View> getConstraints() {
                return isAssignableFrom(DrawerLayout.class);
            }

            @Override
            public String getDescription() {
                return "Closes the drawer";
            }

            @Override
            public void perform(UiController uiController, View view) {
                uiController.loopMainThreadUntilIdle();

                DrawerLayout drawerLayout = (DrawerLayout) view;
                drawerLayout.closeDrawer(drawerEdgeGravity);

                // Wait for a full second to let the inner ViewDragHelper complete the operation
                uiController.loopMainThreadForAtLeast(1000);
            }
        };
    }

    /**
     * Closes the drawer.
     */
    public static ViewAction closeDrawer(final View drawerView) {
        return new ViewAction() {
            @Override
            public Matcher<View> getConstraints() {
                return isAssignableFrom(DrawerLayout.class);
            }

            @Override
            public String getDescription() {
                return "Closes the drawer";
            }

            @Override
            public void perform(UiController uiController, View view) {
                uiController.loopMainThreadUntilIdle();

                DrawerLayout drawerLayout = (DrawerLayout) view;
                drawerLayout.closeDrawer(drawerView);

                // Wait for a full second to let the inner ViewDragHelper complete the operation
                uiController.loopMainThreadForAtLeast(1000);
            }
        };
    }

    /**
     * Sets the lock mode for the drawer at the specified edge gravity.
     */
    public static ViewAction setDrawerLockMode(final int lockMode, final int drawerEdgeGravity) {
        return new ViewAction() {
            @Override
            public Matcher<View> getConstraints() {
                return isAssignableFrom(DrawerLayout.class);
            }

            @Override
            public String getDescription() {
                return "Sets drawer lock mode";
            }

            @Override
            public void perform(UiController uiController, View view) {
                uiController.loopMainThreadUntilIdle();

                DrawerLayout drawerLayout = (DrawerLayout) view;
                drawerLayout.setDrawerLockMode(lockMode, drawerEdgeGravity);

                uiController.loopMainThreadUntilIdle();
            }
        };
    }

    /**
     * Sets the lock mode for the drawer.
     */
    public static ViewAction setDrawerLockMode(final int lockMode, final View drawerView) {
        return new ViewAction() {
            @Override
            public Matcher<View> getConstraints() {
                return isAssignableFrom(DrawerLayout.class);
            }

            @Override
            public String getDescription() {
                return "Sets drawer lock mode";
            }

            @Override
            public void perform(UiController uiController, View view) {
                uiController.loopMainThreadUntilIdle();

                DrawerLayout drawerLayout = (DrawerLayout) view;
                drawerLayout.setDrawerLockMode(lockMode, drawerView);

                uiController.loopMainThreadUntilIdle();
            }
        };
    }
}
