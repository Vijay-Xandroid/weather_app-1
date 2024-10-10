package com.vita.weatherforecast.data.local.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.EntityUpsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.vita.weatherforecast.data.local.entity.CityEntity;
import com.vita.weatherforecast.data.local.entity.CoordEntity;
import com.vita.weatherforecast.data.local.entity.WeatherLocationEntity;
import com.vita.weatherforecast.data.remote.response.WeatherList;
import com.vita.weatherforecast.utils.DataConverter;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class ForecastDao_Impl implements ForecastDao {
  private final RoomDatabase __db;

  private final EntityDeletionOrUpdateAdapter<WeatherLocationEntity> __deletionAdapterOfWeatherLocationEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final EntityUpsertionAdapter<WeatherLocationEntity> __upsertionAdapterOfWeatherLocationEntity;

  public ForecastDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__deletionAdapterOfWeatherLocationEntity = new EntityDeletionOrUpdateAdapter<WeatherLocationEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `Forecast` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final WeatherLocationEntity entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM Forecast";
        return _query;
      }
    };
    this.__upsertionAdapterOfWeatherLocationEntity = new EntityUpsertionAdapter<WeatherLocationEntity>(new EntityInsertionAdapter<WeatherLocationEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT INTO `Forecast` (`id`,`cnt`,`cod`,`list`,`message`,`cityCountry`,`cityId`,`cityName`,`cityPopulation`,`citySunrise`,`citySunset`,`cityTimezone`,`lat`,`lon`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final WeatherLocationEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getCnt() == null) {
          statement.bindNull(2);
        } else {
          statement.bindLong(2, entity.getCnt());
        }
        if (entity.getCod() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getCod());
        }
        final String _tmp = DataConverter.INSTANCE.listToString(entity.getList());
        if (_tmp == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, _tmp);
        }
        if (entity.getMessage() == null) {
          statement.bindNull(5);
        } else {
          statement.bindLong(5, entity.getMessage());
        }
        final CityEntity _tmpCity = entity.getCity();
        if (_tmpCity != null) {
          if (_tmpCity.getCityCountry() == null) {
            statement.bindNull(6);
          } else {
            statement.bindString(6, _tmpCity.getCityCountry());
          }
          if (_tmpCity.getCityId() == null) {
            statement.bindNull(7);
          } else {
            statement.bindLong(7, _tmpCity.getCityId());
          }
          if (_tmpCity.getCityName() == null) {
            statement.bindNull(8);
          } else {
            statement.bindString(8, _tmpCity.getCityName());
          }
          if (_tmpCity.getCityPopulation() == null) {
            statement.bindNull(9);
          } else {
            statement.bindLong(9, _tmpCity.getCityPopulation());
          }
          if (_tmpCity.getCitySunrise() == null) {
            statement.bindNull(10);
          } else {
            statement.bindLong(10, _tmpCity.getCitySunrise());
          }
          if (_tmpCity.getCitySunset() == null) {
            statement.bindNull(11);
          } else {
            statement.bindLong(11, _tmpCity.getCitySunset());
          }
          if (_tmpCity.getCityTimezone() == null) {
            statement.bindNull(12);
          } else {
            statement.bindLong(12, _tmpCity.getCityTimezone());
          }
          final CoordEntity _tmpCityCoord = _tmpCity.getCityCoord();
          if (_tmpCityCoord != null) {
            if (_tmpCityCoord.getLat() == null) {
              statement.bindNull(13);
            } else {
              statement.bindDouble(13, _tmpCityCoord.getLat());
            }
            if (_tmpCityCoord.getLon() == null) {
              statement.bindNull(14);
            } else {
              statement.bindDouble(14, _tmpCityCoord.getLon());
            }
          } else {
            statement.bindNull(13);
            statement.bindNull(14);
          }
        } else {
          statement.bindNull(6);
          statement.bindNull(7);
          statement.bindNull(8);
          statement.bindNull(9);
          statement.bindNull(10);
          statement.bindNull(11);
          statement.bindNull(12);
          statement.bindNull(13);
          statement.bindNull(14);
        }
      }
    }, new EntityDeletionOrUpdateAdapter<WeatherLocationEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE `Forecast` SET `id` = ?,`cnt` = ?,`cod` = ?,`list` = ?,`message` = ?,`cityCountry` = ?,`cityId` = ?,`cityName` = ?,`cityPopulation` = ?,`citySunrise` = ?,`citySunset` = ?,`cityTimezone` = ?,`lat` = ?,`lon` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final WeatherLocationEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getCnt() == null) {
          statement.bindNull(2);
        } else {
          statement.bindLong(2, entity.getCnt());
        }
        if (entity.getCod() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getCod());
        }
        final String _tmp = DataConverter.INSTANCE.listToString(entity.getList());
        if (_tmp == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, _tmp);
        }
        if (entity.getMessage() == null) {
          statement.bindNull(5);
        } else {
          statement.bindLong(5, entity.getMessage());
        }
        final CityEntity _tmpCity = entity.getCity();
        if (_tmpCity != null) {
          if (_tmpCity.getCityCountry() == null) {
            statement.bindNull(6);
          } else {
            statement.bindString(6, _tmpCity.getCityCountry());
          }
          if (_tmpCity.getCityId() == null) {
            statement.bindNull(7);
          } else {
            statement.bindLong(7, _tmpCity.getCityId());
          }
          if (_tmpCity.getCityName() == null) {
            statement.bindNull(8);
          } else {
            statement.bindString(8, _tmpCity.getCityName());
          }
          if (_tmpCity.getCityPopulation() == null) {
            statement.bindNull(9);
          } else {
            statement.bindLong(9, _tmpCity.getCityPopulation());
          }
          if (_tmpCity.getCitySunrise() == null) {
            statement.bindNull(10);
          } else {
            statement.bindLong(10, _tmpCity.getCitySunrise());
          }
          if (_tmpCity.getCitySunset() == null) {
            statement.bindNull(11);
          } else {
            statement.bindLong(11, _tmpCity.getCitySunset());
          }
          if (_tmpCity.getCityTimezone() == null) {
            statement.bindNull(12);
          } else {
            statement.bindLong(12, _tmpCity.getCityTimezone());
          }
          final CoordEntity _tmpCityCoord = _tmpCity.getCityCoord();
          if (_tmpCityCoord != null) {
            if (_tmpCityCoord.getLat() == null) {
              statement.bindNull(13);
            } else {
              statement.bindDouble(13, _tmpCityCoord.getLat());
            }
            if (_tmpCityCoord.getLon() == null) {
              statement.bindNull(14);
            } else {
              statement.bindDouble(14, _tmpCityCoord.getLon());
            }
          } else {
            statement.bindNull(13);
            statement.bindNull(14);
          }
        } else {
          statement.bindNull(6);
          statement.bindNull(7);
          statement.bindNull(8);
          statement.bindNull(9);
          statement.bindNull(10);
          statement.bindNull(11);
          statement.bindNull(12);
          statement.bindNull(13);
          statement.bindNull(14);
        }
        statement.bindLong(15, entity.getId());
      }
    });
  }

  @Override
  public void deleteForecast(final WeatherLocationEntity forecast) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfWeatherLocationEntity.handle(forecast);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public Object upsertWeatherForecast(final WeatherLocationEntity weatherLocationEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __upsertionAdapterOfWeatherLocationEntity.upsert(weatherLocationEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getWeatherForecast(final Continuation<? super WeatherLocationEntity> continuation) {
    final String _sql = "SELECT * FROM Forecast";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<WeatherLocationEntity>() {
      @Override
      @Nullable
      public WeatherLocationEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCnt = CursorUtil.getColumnIndexOrThrow(_cursor, "cnt");
          final int _cursorIndexOfCod = CursorUtil.getColumnIndexOrThrow(_cursor, "cod");
          final int _cursorIndexOfList = CursorUtil.getColumnIndexOrThrow(_cursor, "list");
          final int _cursorIndexOfMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "message");
          final int _cursorIndexOfCityCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "cityCountry");
          final int _cursorIndexOfCityId = CursorUtil.getColumnIndexOrThrow(_cursor, "cityId");
          final int _cursorIndexOfCityName = CursorUtil.getColumnIndexOrThrow(_cursor, "cityName");
          final int _cursorIndexOfCityPopulation = CursorUtil.getColumnIndexOrThrow(_cursor, "cityPopulation");
          final int _cursorIndexOfCitySunrise = CursorUtil.getColumnIndexOrThrow(_cursor, "citySunrise");
          final int _cursorIndexOfCitySunset = CursorUtil.getColumnIndexOrThrow(_cursor, "citySunset");
          final int _cursorIndexOfCityTimezone = CursorUtil.getColumnIndexOrThrow(_cursor, "cityTimezone");
          final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
          final int _cursorIndexOfLon = CursorUtil.getColumnIndexOrThrow(_cursor, "lon");
          final WeatherLocationEntity _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Integer _tmpCnt;
            if (_cursor.isNull(_cursorIndexOfCnt)) {
              _tmpCnt = null;
            } else {
              _tmpCnt = _cursor.getInt(_cursorIndexOfCnt);
            }
            final String _tmpCod;
            if (_cursor.isNull(_cursorIndexOfCod)) {
              _tmpCod = null;
            } else {
              _tmpCod = _cursor.getString(_cursorIndexOfCod);
            }
            final List<WeatherList> _tmpList;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfList)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfList);
            }
            _tmpList = DataConverter.INSTANCE.stringToList(_tmp);
            final Integer _tmpMessage;
            if (_cursor.isNull(_cursorIndexOfMessage)) {
              _tmpMessage = null;
            } else {
              _tmpMessage = _cursor.getInt(_cursorIndexOfMessage);
            }
            final CityEntity _tmpCity;
            if (!(_cursor.isNull(_cursorIndexOfCityCountry) && _cursor.isNull(_cursorIndexOfCityId) && _cursor.isNull(_cursorIndexOfCityName) && _cursor.isNull(_cursorIndexOfCityPopulation) && _cursor.isNull(_cursorIndexOfCitySunrise) && _cursor.isNull(_cursorIndexOfCitySunset) && _cursor.isNull(_cursorIndexOfCityTimezone) && _cursor.isNull(_cursorIndexOfLat) && _cursor.isNull(_cursorIndexOfLon))) {
              final String _tmpCityCountry;
              if (_cursor.isNull(_cursorIndexOfCityCountry)) {
                _tmpCityCountry = null;
              } else {
                _tmpCityCountry = _cursor.getString(_cursorIndexOfCityCountry);
              }
              final Integer _tmpCityId;
              if (_cursor.isNull(_cursorIndexOfCityId)) {
                _tmpCityId = null;
              } else {
                _tmpCityId = _cursor.getInt(_cursorIndexOfCityId);
              }
              final String _tmpCityName;
              if (_cursor.isNull(_cursorIndexOfCityName)) {
                _tmpCityName = null;
              } else {
                _tmpCityName = _cursor.getString(_cursorIndexOfCityName);
              }
              final Integer _tmpCityPopulation;
              if (_cursor.isNull(_cursorIndexOfCityPopulation)) {
                _tmpCityPopulation = null;
              } else {
                _tmpCityPopulation = _cursor.getInt(_cursorIndexOfCityPopulation);
              }
              final Integer _tmpCitySunrise;
              if (_cursor.isNull(_cursorIndexOfCitySunrise)) {
                _tmpCitySunrise = null;
              } else {
                _tmpCitySunrise = _cursor.getInt(_cursorIndexOfCitySunrise);
              }
              final Integer _tmpCitySunset;
              if (_cursor.isNull(_cursorIndexOfCitySunset)) {
                _tmpCitySunset = null;
              } else {
                _tmpCitySunset = _cursor.getInt(_cursorIndexOfCitySunset);
              }
              final Integer _tmpCityTimezone;
              if (_cursor.isNull(_cursorIndexOfCityTimezone)) {
                _tmpCityTimezone = null;
              } else {
                _tmpCityTimezone = _cursor.getInt(_cursorIndexOfCityTimezone);
              }
              final CoordEntity _tmpCityCoord;
              if (!(_cursor.isNull(_cursorIndexOfLat) && _cursor.isNull(_cursorIndexOfLon))) {
                final Double _tmpLat;
                if (_cursor.isNull(_cursorIndexOfLat)) {
                  _tmpLat = null;
                } else {
                  _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
                }
                final Double _tmpLon;
                if (_cursor.isNull(_cursorIndexOfLon)) {
                  _tmpLon = null;
                } else {
                  _tmpLon = _cursor.getDouble(_cursorIndexOfLon);
                }
                _tmpCityCoord = new CoordEntity(_tmpLat,_tmpLon);
              } else {
                _tmpCityCoord = null;
              }
              _tmpCity = new CityEntity(_tmpCityCoord,_tmpCityCountry,_tmpCityId,_tmpCityName,_tmpCityPopulation,_tmpCitySunrise,_tmpCitySunset,_tmpCityTimezone);
            } else {
              _tmpCity = null;
            }
            _result = new WeatherLocationEntity(_tmpId,_tmpCity,_tmpCnt,_tmpCod,_tmpList,_tmpMessage);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<WeatherLocationEntity> getForecastByCoord(final double lat, final double lon) {
    final String _sql = "SELECT * FROM Forecast ORDER BY abs(?) AND abs(?) LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindDouble(_argIndex, lat);
    _argIndex = 2;
    _statement.bindDouble(_argIndex, lon);
    return __db.getInvalidationTracker().createLiveData(new String[] {"Forecast"}, false, new Callable<WeatherLocationEntity>() {
      @Override
      @Nullable
      public WeatherLocationEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCnt = CursorUtil.getColumnIndexOrThrow(_cursor, "cnt");
          final int _cursorIndexOfCod = CursorUtil.getColumnIndexOrThrow(_cursor, "cod");
          final int _cursorIndexOfList = CursorUtil.getColumnIndexOrThrow(_cursor, "list");
          final int _cursorIndexOfMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "message");
          final int _cursorIndexOfCityCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "cityCountry");
          final int _cursorIndexOfCityId = CursorUtil.getColumnIndexOrThrow(_cursor, "cityId");
          final int _cursorIndexOfCityName = CursorUtil.getColumnIndexOrThrow(_cursor, "cityName");
          final int _cursorIndexOfCityPopulation = CursorUtil.getColumnIndexOrThrow(_cursor, "cityPopulation");
          final int _cursorIndexOfCitySunrise = CursorUtil.getColumnIndexOrThrow(_cursor, "citySunrise");
          final int _cursorIndexOfCitySunset = CursorUtil.getColumnIndexOrThrow(_cursor, "citySunset");
          final int _cursorIndexOfCityTimezone = CursorUtil.getColumnIndexOrThrow(_cursor, "cityTimezone");
          final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
          final int _cursorIndexOfLon = CursorUtil.getColumnIndexOrThrow(_cursor, "lon");
          final WeatherLocationEntity _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Integer _tmpCnt;
            if (_cursor.isNull(_cursorIndexOfCnt)) {
              _tmpCnt = null;
            } else {
              _tmpCnt = _cursor.getInt(_cursorIndexOfCnt);
            }
            final String _tmpCod;
            if (_cursor.isNull(_cursorIndexOfCod)) {
              _tmpCod = null;
            } else {
              _tmpCod = _cursor.getString(_cursorIndexOfCod);
            }
            final List<WeatherList> _tmpList;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfList)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfList);
            }
            _tmpList = DataConverter.INSTANCE.stringToList(_tmp);
            final Integer _tmpMessage;
            if (_cursor.isNull(_cursorIndexOfMessage)) {
              _tmpMessage = null;
            } else {
              _tmpMessage = _cursor.getInt(_cursorIndexOfMessage);
            }
            final CityEntity _tmpCity;
            if (!(_cursor.isNull(_cursorIndexOfCityCountry) && _cursor.isNull(_cursorIndexOfCityId) && _cursor.isNull(_cursorIndexOfCityName) && _cursor.isNull(_cursorIndexOfCityPopulation) && _cursor.isNull(_cursorIndexOfCitySunrise) && _cursor.isNull(_cursorIndexOfCitySunset) && _cursor.isNull(_cursorIndexOfCityTimezone) && _cursor.isNull(_cursorIndexOfLat) && _cursor.isNull(_cursorIndexOfLon))) {
              final String _tmpCityCountry;
              if (_cursor.isNull(_cursorIndexOfCityCountry)) {
                _tmpCityCountry = null;
              } else {
                _tmpCityCountry = _cursor.getString(_cursorIndexOfCityCountry);
              }
              final Integer _tmpCityId;
              if (_cursor.isNull(_cursorIndexOfCityId)) {
                _tmpCityId = null;
              } else {
                _tmpCityId = _cursor.getInt(_cursorIndexOfCityId);
              }
              final String _tmpCityName;
              if (_cursor.isNull(_cursorIndexOfCityName)) {
                _tmpCityName = null;
              } else {
                _tmpCityName = _cursor.getString(_cursorIndexOfCityName);
              }
              final Integer _tmpCityPopulation;
              if (_cursor.isNull(_cursorIndexOfCityPopulation)) {
                _tmpCityPopulation = null;
              } else {
                _tmpCityPopulation = _cursor.getInt(_cursorIndexOfCityPopulation);
              }
              final Integer _tmpCitySunrise;
              if (_cursor.isNull(_cursorIndexOfCitySunrise)) {
                _tmpCitySunrise = null;
              } else {
                _tmpCitySunrise = _cursor.getInt(_cursorIndexOfCitySunrise);
              }
              final Integer _tmpCitySunset;
              if (_cursor.isNull(_cursorIndexOfCitySunset)) {
                _tmpCitySunset = null;
              } else {
                _tmpCitySunset = _cursor.getInt(_cursorIndexOfCitySunset);
              }
              final Integer _tmpCityTimezone;
              if (_cursor.isNull(_cursorIndexOfCityTimezone)) {
                _tmpCityTimezone = null;
              } else {
                _tmpCityTimezone = _cursor.getInt(_cursorIndexOfCityTimezone);
              }
              final CoordEntity _tmpCityCoord;
              if (!(_cursor.isNull(_cursorIndexOfLat) && _cursor.isNull(_cursorIndexOfLon))) {
                final Double _tmpLat;
                if (_cursor.isNull(_cursorIndexOfLat)) {
                  _tmpLat = null;
                } else {
                  _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
                }
                final Double _tmpLon;
                if (_cursor.isNull(_cursorIndexOfLon)) {
                  _tmpLon = null;
                } else {
                  _tmpLon = _cursor.getDouble(_cursorIndexOfLon);
                }
                _tmpCityCoord = new CoordEntity(_tmpLat,_tmpLon);
              } else {
                _tmpCityCoord = null;
              }
              _tmpCity = new CityEntity(_tmpCityCoord,_tmpCityCountry,_tmpCityId,_tmpCityName,_tmpCityPopulation,_tmpCitySunrise,_tmpCitySunset,_tmpCityTimezone);
            } else {
              _tmpCity = null;
            }
            _result = new WeatherLocationEntity(_tmpId,_tmpCity,_tmpCnt,_tmpCod,_tmpList,_tmpMessage);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public int getCount() {
    final String _sql = "Select count(*) from Forecast";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
