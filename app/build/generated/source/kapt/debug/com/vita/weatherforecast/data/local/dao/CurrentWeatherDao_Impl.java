package com.vita.weatherforecast.data.local.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.vita.weatherforecast.data.local.entity.CloudsEntity;
import com.vita.weatherforecast.data.local.entity.MainEntity;
import com.vita.weatherforecast.data.local.entity.RainEntity;
import com.vita.weatherforecast.data.local.entity.SysEntity;
import com.vita.weatherforecast.data.local.entity.WeatherListEntity;
import com.vita.weatherforecast.data.local.entity.WindEntity;
import com.vita.weatherforecast.data.remote.response.Weather;
import com.vita.weatherforecast.utils.DataConverter;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class CurrentWeatherDao_Impl implements CurrentWeatherDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WeatherListEntity> __insertionAdapterOfWeatherListEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCurrentWeather;

  public CurrentWeatherDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWeatherListEntity = new EntityInsertionAdapter<WeatherListEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `CurrentWeather` (`id`,`dt`,`dtTxt`,`pop`,`visibility`,`weather`,`all`,`feelsLike`,`grndLevel`,`humidity`,`pressure`,`seaLevel`,`temp`,`tempKf`,`tempMax`,`tempMin`,`jsonMember3h`,`pod`,`deg`,`gust`,`speed`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final WeatherListEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getDt() == null) {
          statement.bindNull(2);
        } else {
          statement.bindLong(2, entity.getDt());
        }
        if (entity.getDtTxt() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getDtTxt());
        }
        if (entity.getPop() == null) {
          statement.bindNull(4);
        } else {
          statement.bindDouble(4, entity.getPop());
        }
        if (entity.getVisibility() == null) {
          statement.bindNull(5);
        } else {
          statement.bindLong(5, entity.getVisibility());
        }
        final String _tmp = DataConverter.INSTANCE.weatherListToString(entity.getWeather());
        if (_tmp == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, _tmp);
        }
        final CloudsEntity _tmpClouds = entity.getClouds();
        if (_tmpClouds != null) {
          if (_tmpClouds.getAll() == null) {
            statement.bindNull(7);
          } else {
            statement.bindLong(7, _tmpClouds.getAll());
          }
        } else {
          statement.bindNull(7);
        }
        final MainEntity _tmpMain = entity.getMain();
        if (_tmpMain.getFeelsLike() == null) {
          statement.bindNull(8);
        } else {
          statement.bindDouble(8, _tmpMain.getFeelsLike());
        }
        if (_tmpMain.getGrndLevel() == null) {
          statement.bindNull(9);
        } else {
          statement.bindLong(9, _tmpMain.getGrndLevel());
        }
        if (_tmpMain.getHumidity() == null) {
          statement.bindNull(10);
        } else {
          statement.bindLong(10, _tmpMain.getHumidity());
        }
        if (_tmpMain.getPressure() == null) {
          statement.bindNull(11);
        } else {
          statement.bindLong(11, _tmpMain.getPressure());
        }
        if (_tmpMain.getSeaLevel() == null) {
          statement.bindNull(12);
        } else {
          statement.bindLong(12, _tmpMain.getSeaLevel());
        }
        if (_tmpMain.getTemp() == null) {
          statement.bindNull(13);
        } else {
          statement.bindDouble(13, _tmpMain.getTemp());
        }
        if (_tmpMain.getTempKf() == null) {
          statement.bindNull(14);
        } else {
          statement.bindDouble(14, _tmpMain.getTempKf());
        }
        if (_tmpMain.getTempMax() == null) {
          statement.bindNull(15);
        } else {
          statement.bindDouble(15, _tmpMain.getTempMax());
        }
        if (_tmpMain.getTempMin() == null) {
          statement.bindNull(16);
        } else {
          statement.bindDouble(16, _tmpMain.getTempMin());
        }
        final RainEntity _tmpRain = entity.getRain();
        if (_tmpRain.getJsonMember3h() == null) {
          statement.bindNull(17);
        } else {
          statement.bindDouble(17, _tmpRain.getJsonMember3h());
        }
        final SysEntity _tmpSys = entity.getSys();
        if (_tmpSys.getPod() == null) {
          statement.bindNull(18);
        } else {
          statement.bindString(18, _tmpSys.getPod());
        }
        final WindEntity _tmpWind = entity.getWind();
        if (_tmpWind != null) {
          if (_tmpWind.getDeg() == null) {
            statement.bindNull(19);
          } else {
            statement.bindLong(19, _tmpWind.getDeg());
          }
          if (_tmpWind.getGust() == null) {
            statement.bindNull(20);
          } else {
            statement.bindDouble(20, _tmpWind.getGust());
          }
          if (_tmpWind.getSpeed() == null) {
            statement.bindNull(21);
          } else {
            statement.bindDouble(21, _tmpWind.getSpeed());
          }
        } else {
          statement.bindNull(19);
          statement.bindNull(20);
          statement.bindNull(21);
        }
      }
    };
    this.__preparedStmtOfDeleteCurrentWeather = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM CurrentWeather";
        return _query;
      }
    };
  }

  @Override
  public void insertCurrentWeather(final WeatherListEntity weatherListEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWeatherListEntity.insert(weatherListEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteCurrentWeather() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCurrentWeather.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteCurrentWeather.release(_stmt);
    }
  }

  @Override
  public LiveData<WeatherListEntity> getCurrentWeather() {
    final String _sql = "SELECT * FROM CurrentWeather";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"CurrentWeather"}, false, new Callable<WeatherListEntity>() {
      @Override
      @Nullable
      public WeatherListEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDt = CursorUtil.getColumnIndexOrThrow(_cursor, "dt");
          final int _cursorIndexOfDtTxt = CursorUtil.getColumnIndexOrThrow(_cursor, "dtTxt");
          final int _cursorIndexOfPop = CursorUtil.getColumnIndexOrThrow(_cursor, "pop");
          final int _cursorIndexOfVisibility = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility");
          final int _cursorIndexOfWeather = CursorUtil.getColumnIndexOrThrow(_cursor, "weather");
          final int _cursorIndexOfAll = CursorUtil.getColumnIndexOrThrow(_cursor, "all");
          final int _cursorIndexOfFeelsLike = CursorUtil.getColumnIndexOrThrow(_cursor, "feelsLike");
          final int _cursorIndexOfGrndLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "grndLevel");
          final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
          final int _cursorIndexOfPressure = CursorUtil.getColumnIndexOrThrow(_cursor, "pressure");
          final int _cursorIndexOfSeaLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "seaLevel");
          final int _cursorIndexOfTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "temp");
          final int _cursorIndexOfTempKf = CursorUtil.getColumnIndexOrThrow(_cursor, "tempKf");
          final int _cursorIndexOfTempMax = CursorUtil.getColumnIndexOrThrow(_cursor, "tempMax");
          final int _cursorIndexOfTempMin = CursorUtil.getColumnIndexOrThrow(_cursor, "tempMin");
          final int _cursorIndexOfJsonMember3h = CursorUtil.getColumnIndexOrThrow(_cursor, "jsonMember3h");
          final int _cursorIndexOfPod = CursorUtil.getColumnIndexOrThrow(_cursor, "pod");
          final int _cursorIndexOfDeg = CursorUtil.getColumnIndexOrThrow(_cursor, "deg");
          final int _cursorIndexOfGust = CursorUtil.getColumnIndexOrThrow(_cursor, "gust");
          final int _cursorIndexOfSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "speed");
          final WeatherListEntity _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Long _tmpDt;
            if (_cursor.isNull(_cursorIndexOfDt)) {
              _tmpDt = null;
            } else {
              _tmpDt = _cursor.getLong(_cursorIndexOfDt);
            }
            final String _tmpDtTxt;
            if (_cursor.isNull(_cursorIndexOfDtTxt)) {
              _tmpDtTxt = null;
            } else {
              _tmpDtTxt = _cursor.getString(_cursorIndexOfDtTxt);
            }
            final Double _tmpPop;
            if (_cursor.isNull(_cursorIndexOfPop)) {
              _tmpPop = null;
            } else {
              _tmpPop = _cursor.getDouble(_cursorIndexOfPop);
            }
            final Integer _tmpVisibility;
            if (_cursor.isNull(_cursorIndexOfVisibility)) {
              _tmpVisibility = null;
            } else {
              _tmpVisibility = _cursor.getInt(_cursorIndexOfVisibility);
            }
            final List<Weather> _tmpWeather;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfWeather)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfWeather);
            }
            _tmpWeather = DataConverter.INSTANCE.weatherStringToList(_tmp);
            final CloudsEntity _tmpClouds;
            if (!(_cursor.isNull(_cursorIndexOfAll))) {
              final Integer _tmpAll;
              if (_cursor.isNull(_cursorIndexOfAll)) {
                _tmpAll = null;
              } else {
                _tmpAll = _cursor.getInt(_cursorIndexOfAll);
              }
              _tmpClouds = new CloudsEntity(_tmpAll);
            } else {
              _tmpClouds = null;
            }
            final MainEntity _tmpMain;
            final Double _tmpFeelsLike;
            if (_cursor.isNull(_cursorIndexOfFeelsLike)) {
              _tmpFeelsLike = null;
            } else {
              _tmpFeelsLike = _cursor.getDouble(_cursorIndexOfFeelsLike);
            }
            final Integer _tmpGrndLevel;
            if (_cursor.isNull(_cursorIndexOfGrndLevel)) {
              _tmpGrndLevel = null;
            } else {
              _tmpGrndLevel = _cursor.getInt(_cursorIndexOfGrndLevel);
            }
            final Integer _tmpHumidity;
            if (_cursor.isNull(_cursorIndexOfHumidity)) {
              _tmpHumidity = null;
            } else {
              _tmpHumidity = _cursor.getInt(_cursorIndexOfHumidity);
            }
            final Integer _tmpPressure;
            if (_cursor.isNull(_cursorIndexOfPressure)) {
              _tmpPressure = null;
            } else {
              _tmpPressure = _cursor.getInt(_cursorIndexOfPressure);
            }
            final Integer _tmpSeaLevel;
            if (_cursor.isNull(_cursorIndexOfSeaLevel)) {
              _tmpSeaLevel = null;
            } else {
              _tmpSeaLevel = _cursor.getInt(_cursorIndexOfSeaLevel);
            }
            final Double _tmpTemp;
            if (_cursor.isNull(_cursorIndexOfTemp)) {
              _tmpTemp = null;
            } else {
              _tmpTemp = _cursor.getDouble(_cursorIndexOfTemp);
            }
            final Double _tmpTempKf;
            if (_cursor.isNull(_cursorIndexOfTempKf)) {
              _tmpTempKf = null;
            } else {
              _tmpTempKf = _cursor.getDouble(_cursorIndexOfTempKf);
            }
            final Double _tmpTempMax;
            if (_cursor.isNull(_cursorIndexOfTempMax)) {
              _tmpTempMax = null;
            } else {
              _tmpTempMax = _cursor.getDouble(_cursorIndexOfTempMax);
            }
            final Double _tmpTempMin;
            if (_cursor.isNull(_cursorIndexOfTempMin)) {
              _tmpTempMin = null;
            } else {
              _tmpTempMin = _cursor.getDouble(_cursorIndexOfTempMin);
            }
            _tmpMain = new MainEntity(_tmpFeelsLike,_tmpGrndLevel,_tmpHumidity,_tmpPressure,_tmpSeaLevel,_tmpTemp,_tmpTempKf,_tmpTempMax,_tmpTempMin);
            final RainEntity _tmpRain;
            final Double _tmpJsonMember3h;
            if (_cursor.isNull(_cursorIndexOfJsonMember3h)) {
              _tmpJsonMember3h = null;
            } else {
              _tmpJsonMember3h = _cursor.getDouble(_cursorIndexOfJsonMember3h);
            }
            _tmpRain = new RainEntity(_tmpJsonMember3h);
            final SysEntity _tmpSys;
            final String _tmpPod;
            if (_cursor.isNull(_cursorIndexOfPod)) {
              _tmpPod = null;
            } else {
              _tmpPod = _cursor.getString(_cursorIndexOfPod);
            }
            _tmpSys = new SysEntity(_tmpPod);
            final WindEntity _tmpWind;
            if (!(_cursor.isNull(_cursorIndexOfDeg) && _cursor.isNull(_cursorIndexOfGust) && _cursor.isNull(_cursorIndexOfSpeed))) {
              final Integer _tmpDeg;
              if (_cursor.isNull(_cursorIndexOfDeg)) {
                _tmpDeg = null;
              } else {
                _tmpDeg = _cursor.getInt(_cursorIndexOfDeg);
              }
              final Double _tmpGust;
              if (_cursor.isNull(_cursorIndexOfGust)) {
                _tmpGust = null;
              } else {
                _tmpGust = _cursor.getDouble(_cursorIndexOfGust);
              }
              final Double _tmpSpeed;
              if (_cursor.isNull(_cursorIndexOfSpeed)) {
                _tmpSpeed = null;
              } else {
                _tmpSpeed = _cursor.getDouble(_cursorIndexOfSpeed);
              }
              _tmpWind = new WindEntity(_tmpDeg,_tmpGust,_tmpSpeed);
            } else {
              _tmpWind = null;
            }
            _result = new WeatherListEntity(_tmpId,_tmpClouds,_tmpDt,_tmpDtTxt,_tmpMain,_tmpPop,_tmpRain,_tmpSys,_tmpVisibility,_tmpWeather,_tmpWind);
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
    final String _sql = "Select count(*) from CurrentWeather";
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
