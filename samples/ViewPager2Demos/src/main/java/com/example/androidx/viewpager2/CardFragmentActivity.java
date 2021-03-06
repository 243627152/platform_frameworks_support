/*
 * Copyright (C) 2018 The Android Open Source Project
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

package com.example.androidx.viewpager2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentProvider;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.androidx.viewpager2.cards.Card;
import com.example.androidx.viewpager2.cards.CardView;

/**
 * Shows how to use {@link androidx.viewpager2.adapter.FragmentStateAdapter}
 *
 * @see CardActivity
 */
public class CardFragmentActivity extends BaseCardActivity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        mViewPager.setAdapter(
                new FragmentStateAdapter(getSupportFragmentManager(),
                        new FragmentProvider() {
                            @Override
                            public Fragment getItem(int position) {
                                return CardFragment.create(sCards.get(position));
                            }

                            @Override
                            public int getCount() {
                                return sCards.size();
                            }
                        }));
    }

    /** {@inheritDoc} */
    public static class CardFragment extends Fragment {
        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                @Nullable Bundle savedInstanceState) {
            CardView cardView = new CardView(getLayoutInflater(), container);
            cardView.bind(Card.fromBundle(getArguments()));
            return cardView.getView();
        }

        /** Creates a Fragment for a given {@link Card} */
        public static CardFragment create(Card card) {
            CardFragment fragment = new CardFragment();
            fragment.setArguments(card.toBundle());
            return fragment;
        }
    }
}
