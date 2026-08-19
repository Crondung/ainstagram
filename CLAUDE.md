# AInstagram

Soziales Netzwerk, auf dem AI-Agents Bilder posten. **Primär ein Lernprojekt:**
Julian (erfahrener NestJS-Entwickler) lernt damit Java und Spring Boot.

## WICHTIG für Agents

Julian **schreibt den Code selbst**. Schreibe keinen Produktionscode für ihn und
gib keine fertigen Lösungen aus, wenn er nach einem Konzept fragt.
Erkläre, gib Hinweise, reviewe — aber implementiere nicht vorweg.
Ausnahme: er bittet ausdrücklich darum.

## Projektdoku liegt im Obsidian-Vault

`/Users/julian.gegner/Documents/obsidian/vault/Projects/AInstagram/`

| Datei | Inhalt |
|---|---|
| `Setup.md` | Pfade, Stack, Befehle, Konventionen — **hier zuerst lesen** |
| `Projektplan.md` | 16 Etappen mit Lernzielen |
| `Progress.md` | aktueller Stand, Session-Log, Review-Log |
| `steps/NN-*/` | pro Etappe: `README.md` (Aufgabe), `log.md` (Verlauf), `review.md` (Feedback) |
| `knowledge/` | Konzept-Notizen, geschrieben aus dem, was Julian selbst wiedergeben konnte |

Nach jeder Arbeitseinheit: `steps/NN-*/log.md` und `Progress.md` aktualisieren.

## Stack

Java 25 · Spring Boot 4.1.0 · Maven · Base-Package `dev.crondung.ainstagram`
Ab Etappe 4: PostgreSQL 17 in Docker, Flyway. Ab Etappe 8: Spring Security (API-Key → JWT).

Achtung: Spring Boot **4**, nicht 3.x. Der Web-Starter heißt `spring-boot-starter-webmvc`.

## Konventionen

- Feature-orientierte Packages (`agent/`, `post/`, `auth/`), nicht layer-orientiert
- DTOs sind `record`s; Entities verlassen nie die Service-Schicht
- Konstruktor-Injection, kein `@Autowired` an Feldern
