// Generated by view binder compiler. Do not edit!
package com.vita.weatherforecast.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.vita.weatherforecast.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentWeatherDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView_;

  @NonNull
  public final MaterialCardView cardView;

  @NonNull
  public final MaterialCardView cardViewHourOfDayContainer;

  @NonNull
  public final TextView cityName;

  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  @NonNull
  public final FloatingActionButton fabClose;

  @NonNull
  public final TextView hourTextView;

  @NonNull
  public final ImageView imageViewForecastIcon;

  @NonNull
  public final RecyclerView recyclerViewHourOfDay;

  @NonNull
  public final ConstraintLayout rootView;

  @NonNull
  public final NestedScrollView scrollView;

  @NonNull
  public final TextView tempMaxText;

  @NonNull
  public final TextView tempMinText;

  @NonNull
  public final TextView textViewDayOfWeek;

  @NonNull
  public final TextView textViewTemp;

  @NonNull
  public final ConstraintLayout weatherDetailsContainerBgd;

  private FragmentWeatherDetailBinding(@NonNull ConstraintLayout rootView_,
      @NonNull MaterialCardView cardView, @NonNull MaterialCardView cardViewHourOfDayContainer,
      @NonNull TextView cityName, @NonNull CoordinatorLayout coordinatorLayout,
      @NonNull FloatingActionButton fabClose, @NonNull TextView hourTextView,
      @NonNull ImageView imageViewForecastIcon, @NonNull RecyclerView recyclerViewHourOfDay,
      @NonNull ConstraintLayout rootView, @NonNull NestedScrollView scrollView,
      @NonNull TextView tempMaxText, @NonNull TextView tempMinText,
      @NonNull TextView textViewDayOfWeek, @NonNull TextView textViewTemp,
      @NonNull ConstraintLayout weatherDetailsContainerBgd) {
    this.rootView_ = rootView_;
    this.cardView = cardView;
    this.cardViewHourOfDayContainer = cardViewHourOfDayContainer;
    this.cityName = cityName;
    this.coordinatorLayout = coordinatorLayout;
    this.fabClose = fabClose;
    this.hourTextView = hourTextView;
    this.imageViewForecastIcon = imageViewForecastIcon;
    this.recyclerViewHourOfDay = recyclerViewHourOfDay;
    this.rootView = rootView;
    this.scrollView = scrollView;
    this.tempMaxText = tempMaxText;
    this.tempMinText = tempMinText;
    this.textViewDayOfWeek = textViewDayOfWeek;
    this.textViewTemp = textViewTemp;
    this.weatherDetailsContainerBgd = weatherDetailsContainerBgd;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView_;
  }

  @NonNull
  public static FragmentWeatherDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentWeatherDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_weather_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentWeatherDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView;
      MaterialCardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.cardViewHourOfDayContainer;
      MaterialCardView cardViewHourOfDayContainer = ViewBindings.findChildViewById(rootView, id);
      if (cardViewHourOfDayContainer == null) {
        break missingId;
      }

      id = R.id.cityName;
      TextView cityName = ViewBindings.findChildViewById(rootView, id);
      if (cityName == null) {
        break missingId;
      }

      id = R.id.coordinatorLayout;
      CoordinatorLayout coordinatorLayout = ViewBindings.findChildViewById(rootView, id);
      if (coordinatorLayout == null) {
        break missingId;
      }

      id = R.id.fabClose;
      FloatingActionButton fabClose = ViewBindings.findChildViewById(rootView, id);
      if (fabClose == null) {
        break missingId;
      }

      id = R.id.hourTextView;
      TextView hourTextView = ViewBindings.findChildViewById(rootView, id);
      if (hourTextView == null) {
        break missingId;
      }

      id = R.id.imageViewForecastIcon;
      ImageView imageViewForecastIcon = ViewBindings.findChildViewById(rootView, id);
      if (imageViewForecastIcon == null) {
        break missingId;
      }

      id = R.id.recyclerViewHourOfDay;
      RecyclerView recyclerViewHourOfDay = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewHourOfDay == null) {
        break missingId;
      }

      ConstraintLayout rootView_ = (ConstraintLayout) rootView;

      id = R.id.scrollView;
      NestedScrollView scrollView = ViewBindings.findChildViewById(rootView, id);
      if (scrollView == null) {
        break missingId;
      }

      id = R.id.tempMaxText;
      TextView tempMaxText = ViewBindings.findChildViewById(rootView, id);
      if (tempMaxText == null) {
        break missingId;
      }

      id = R.id.tempMinText;
      TextView tempMinText = ViewBindings.findChildViewById(rootView, id);
      if (tempMinText == null) {
        break missingId;
      }

      id = R.id.textViewDayOfWeek;
      TextView textViewDayOfWeek = ViewBindings.findChildViewById(rootView, id);
      if (textViewDayOfWeek == null) {
        break missingId;
      }

      id = R.id.textViewTemp;
      TextView textViewTemp = ViewBindings.findChildViewById(rootView, id);
      if (textViewTemp == null) {
        break missingId;
      }

      id = R.id.weatherDetailsContainerBgd;
      ConstraintLayout weatherDetailsContainerBgd = ViewBindings.findChildViewById(rootView, id);
      if (weatherDetailsContainerBgd == null) {
        break missingId;
      }

      return new FragmentWeatherDetailBinding((ConstraintLayout) rootView, cardView,
          cardViewHourOfDayContainer, cityName, coordinatorLayout, fabClose, hourTextView,
          imageViewForecastIcon, recyclerViewHourOfDay, rootView_, scrollView, tempMaxText,
          tempMinText, textViewDayOfWeek, textViewTemp, weatherDetailsContainerBgd);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
