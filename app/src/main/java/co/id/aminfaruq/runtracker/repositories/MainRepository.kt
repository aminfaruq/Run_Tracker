package co.id.aminfaruq.runtracker.repositories

import co.id.aminfaruq.runtracker.db.Run
import co.id.aminfaruq.runtracker.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao : RunDAO
) {

    suspend fun insertRun(run : Run) = runDao.insertRun(run)

    suspend fun deleteRun(run : Run) = runDao.deleteRun(run)

    fun getAllRunsSortedByDate() = runDao.getAllRunsSortedByDate()

    fun getAllRunsSortedByDistance() = runDao.getAllRunsSortedByDistance()

    fun getAllRunsSortedByTimeMillis() = runDao.getAllRunsSortedByTimeInMillis()

    fun getAllRunsSortedByAvgSpeed() = runDao.getAllRunsSortedByAvgSpeed()

    fun getAllRunsSortedByCaloriesBurned() = runDao.getAllRunsSortedByCaloriesBurned()

    fun getTotalAvgSpeed() = runDao.getTotalAvgSpeed()

    fun getTotalDistance() = runDao.getTotalDistance()

    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()

    fun getTotalTimeMillis() = runDao.getTotalTimeInMillis()

}