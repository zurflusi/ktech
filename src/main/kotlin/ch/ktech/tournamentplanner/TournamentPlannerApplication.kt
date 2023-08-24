package ch.ktech.tournamentplanner

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TournamentPlannerApplication

fun main(args: Array<String>) {
	runApplication<TournamentPlannerApplication>(*args)
}
