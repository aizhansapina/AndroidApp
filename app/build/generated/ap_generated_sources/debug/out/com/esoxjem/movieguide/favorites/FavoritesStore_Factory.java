package com.esoxjem.movieguide.favorites;

import dagger.internal.Factory;
import io.realm.Realm;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FavoritesStore_Factory implements Factory<FavoritesStore> {
  private final Provider<Realm> realmProvider;

  public FavoritesStore_Factory(Provider<Realm> realmProvider) {
    assert realmProvider != null;
    this.realmProvider = realmProvider;
  }

  @Override
  public FavoritesStore get() {
    return new FavoritesStore(realmProvider.get());
  }

  public static Factory<FavoritesStore> create(Provider<Realm> realmProvider) {
    return new FavoritesStore_Factory(realmProvider);
  }
}
