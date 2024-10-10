package com.vita.weatherforecast.data.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.vita.weatherforecast.data.local.dao.CurrentWeatherDao;
import com.vita.weatherforecast.data.local.dao.CurrentWeatherDao_Impl;
import com.vita.weatherforecast.data.local.dao.ForecastDao;
import com.vita.weatherforecast.data.local.dao.ForecastDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class WeatherAppDatabase_Impl extends WeatherAppDatabase {
  private volatile CurrentWeatherDao _currentWeatherDao;

  private volatile ForecastDao _forecastDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `Forecast` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `cnt` INTEGER, `cod` TEXT, `list` TEXT, `message` INTEGER, `cityCountry` TEXT, `cityId` INTEGER, `cityName` TEXT, `cityPopulation` INTEGER, `citySunrise` INTEGER, `citySunset` INTEGER, `cityTimezone` INTEGER, `lat` REAL, `lon` REAL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `CurrentWeather` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `dt` INTEGER, `dtTxt` TEXT, `pop` REAL, `visibility` INTEGER, `weather` TEXT, `all` INTEGER, `feelsLike` REAL, `grndLevel` INTEGER, `humidity` INTEGER, `pressure` INTEGER, `seaLevel` INTEGER, `temp` REAL, `tempKf` REAL, `tempMax` REAL, `tempMin` REAL, `jsonMember3h` REAL, `pod` TEXT, `deg` INTEGER, `gust` REAL, `speed` REAL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd4d8e1cab4cff28289e3ff7ed09e1946')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `Forecast`");
        db.execSQL("DROP TABLE IF EXISTS `CurrentWeather`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsForecast = new HashMap<String, TableInfo.Column>(14);
        _columnsForecast.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecast.put("cnt", new TableInfo.Column("cnt", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecast.put("cod", new TableInfo.Column("cod", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecast.put("list", new TableInfo.Column("list", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecast.put("message", new TableInfo.Column("message", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecast.put("cityCountry", new TableInfo.Column("cityCountry", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecast.put("cityId", new TableInfo.Column("cityId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecast.put("cityName", new TableInfo.Column("cityName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecast.put("cityPopulation", new TableInfo.Column("cityPopulation", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecast.put("citySunrise", new TableInfo.Column("citySunrise", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecast.put("citySunset", new TableInfo.Column("citySunset", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecast.put("cityTimezone", new TableInfo.Column("cityTimezone", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecast.put("lat", new TableInfo.Column("lat", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecast.put("lon", new TableInfo.Column("lon", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysForecast = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesForecast = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoForecast = new TableInfo("Forecast", _columnsForecast, _foreignKeysForecast, _indicesForecast);
        final TableInfo _existingForecast = TableInfo.read(db, "Forecast");
        if (!_infoForecast.equals(_existingForecast)) {
          return new RoomOpenHelper.ValidationResult(false, "Forecast(com.vita.weatherforecast.data.local.entity.WeatherLocationEntity).\n"
                  + " Expected:\n" + _infoForecast + "\n"
                  + " Found:\n" + _existingForecast);
        }
        final HashMap<String, TableInfo.Column> _columnsCurrentWeather = new HashMap<String, TableInfo.Column>(21);
        _columnsCurrentWeather.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("dt", new TableInfo.Column("dt", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("dtTxt", new TableInfo.Column("dtTxt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("pop", new TableInfo.Column("pop", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("visibility", new TableInfo.Column("visibility", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("weather", new TableInfo.Column("weather", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("all", new TableInfo.Column("all", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("feelsLike", new TableInfo.Column("feelsLike", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("grndLevel", new TableInfo.Column("grndLevel", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("humidity", new TableInfo.Column("humidity", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("pressure", new TableInfo.Column("pressure", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("seaLevel", new TableInfo.Column("seaLevel", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("temp", new TableInfo.Column("temp", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("tempKf", new TableInfo.Column("tempKf", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("tempMax", new TableInfo.Column("tempMax", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("tempMin", new TableInfo.Column("tempMin", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("jsonMember3h", new TableInfo.Column("jsonMember3h", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("pod", new TableInfo.Column("pod", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("deg", new TableInfo.Column("deg", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("gust", new TableInfo.Column("gust", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("speed", new TableInfo.Column("speed", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCurrentWeather = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCurrentWeather = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCurrentWeather = new TableInfo("CurrentWeather", _columnsCurrentWeather, _foreignKeysCurrentWeather, _indicesCurrentWeather);
        final TableInfo _existingCurrentWeather = TableInfo.read(db, "CurrentWeather");
        if (!_infoCurrentWeather.equals(_existingCurrentWeather)) {
          return new RoomOpenHelper.ValidationResult(false, "CurrentWeather(com.vita.weatherforecast.data.local.entity.WeatherListEntity).\n"
                  + " Expected:\n" + _infoCurrentWeather + "\n"
                  + " Found:\n" + _existingCurrentWeather);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "d4d8e1cab4cff28289e3ff7ed09e1946", "77d3d8701dac78891d9bc77e0fdc0ec9");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Forecast","CurrentWeather");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Forecast`");
      _db.execSQL("DELETE FROM `CurrentWeather`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CurrentWeatherDao.class, CurrentWeatherDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ForecastDao.class, ForecastDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public CurrentWeatherDao getCurrentWeatherDao() {
    if (_currentWeatherDao != null) {
      return _currentWeatherDao;
    } else {
      synchronized(this) {
        if(_currentWeatherDao == null) {
          _currentWeatherDao = new CurrentWeatherDao_Impl(this);
        }
        return _currentWeatherDao;
      }
    }
  }

  @Override
  public ForecastDao getForecastDao() {
    if (_forecastDao != null) {
      return _forecastDao;
    } else {
      synchronized(this) {
        if(_forecastDao == null) {
          _forecastDao = new ForecastDao_Impl(this);
        }
        return _forecastDao;
      }
    }
  }
}
