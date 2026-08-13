Nombre: Taller Git Maven

Autor: Gabriel Cuartas Barrios

Descripción: Este es un proyecto que ayuda a familiariarse con Git y Maven usando IntelliJ IDEA. 

Aprendizajes: Se aprende a manejar Git y GitHub para control de versiones de los productos de software o proyectos en los que se esté trabajando.


Comandos Practicados: 


gcuar@GabrielPC MINGW64 ~
$ cd "Software Engineering"

gcuar@GabrielPC MINGW64 ~/Software Engineering
$ cd "Semestre III"

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III
$ cd "APO2"

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2
$ cd TallerGitMaven

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven
$ cd taller-git-maven

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven
$ git init
Initialized empty Git repository in C:/Users/gcuar/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven/.git/

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git status
On branch main

No commits yet

Untracked files:
(use "git add <file>..." to include in what will be committed)
.gitignore
.idea/
README.md
pom.xml
src/

nothing added to commit but untracked files present (use "git add" to track)

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git branch --show-current
main

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git add README.md .gitignore src
warning: in the working copy of '.gitignore', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/main/java/co/edu/icesi/Main.java', LF will be replaced by CRLF the next time Git touches it

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git status
On branch main

No commits yet

Changes to be committed:
(use "git rm --cached <file>..." to unstage)
new file:   .gitignore
new file:   README.md
new file:   src/main/java/co/edu/icesi/Main.java

Untracked files:
(use "git add <file>..." to include in what will be committed)
.idea/
pom.xml


gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git commit -m "chore: crear estructura inicial del proyecto"
[main (root-commit) 292f5cd] chore: crear estructura inicial del proyecto
3 files changed, 53 insertions(+)
create mode 100644 .gitignore
create mode 100644 README.md
create mode 100644 src/main/java/co/edu/icesi/Main.java

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git log --oneline
292f5cd (HEAD -> main) chore: crear estructura inicial del proyecto

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git status
On branch main
Changes not staged for commit:
(use "git add <file>..." to update what will be committed)
(use "git restore <file>..." to discard changes in working directory)
modified:   src/main/java/co/edu/icesi/Main.java

Untracked files:
(use "git add <file>..." to include in what will be committed)
.idea/
pom.xml

no changes added to commit (use "git add" and/or "git commit -a")

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git diff
warning: in the working copy of 'src/main/java/co/edu/icesi/Main.java', LF will be replaced by CRLF the next time Git touches it
diff --git a/src/main/java/co/edu/icesi/Main.java b/src/main/java/co/edu/icesi/Main.java
index 3b03e1a..d790a66 100644
--- a/src/main/java/co/edu/icesi/Main.java
+++ b/src/main/java/co/edu/icesi/Main.java
@@ -1,9 +1,14 @@
package co.edu.icesi;

+import java.util.Scanner;
+
public class Main {
public static void main(String[] args) {

-        System.out.println("Hola a todos.");
+        Scanner sc = new Scanner(System.in);
+        System.out.println("Ingrese su nombre:");
+        String nombre = sc.nextLine();
+        System.out.println("Hola, " + nombre + "!");

  }
  }

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git add src/main/java/co/edu/icesi/Main.java
warning: in the working copy of 'src/main/java/co/edu/icesi/Main.java', LF will be replaced by CRLF the next time Git touches it

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git diff --staged
diff --git a/src/main/java/co/edu/icesi/Main.java b/src/main/java/co/edu/icesi/Main.java
index 3b03e1a..d790a66 100644
--- a/src/main/java/co/edu/icesi/Main.java
+++ b/src/main/java/co/edu/icesi/Main.java
@@ -1,9 +1,14 @@
package co.edu.icesi;

+import java.util.Scanner;
+
public class Main {
public static void main(String[] args) {

-        System.out.println("Hola a todos.");
+        Scanner sc = new Scanner(System.in);
+        System.out.println("Ingrese su nombre:");
+        String nombre = sc.nextLine();
+        System.out.println("Hola, " + nombre + "!");

  }
  }
  \ No newline at end of file

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git commit -m "feat: agregar saludo personalizado"
[main 355b9f2] feat: agregar saludo personalizado
1 file changed, 6 insertions(+), 1 deletion(-)

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git switch -c feature/mensaje-despedida
Switched to a new branch 'feature/mensaje-despedida'

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (feature/mensaje-despedida)
$ git add src/main/java/co/edu/icesi/Main.java
warning: in the working copy of 'src/main/java/co/edu/icesi/Main.java', LF will be replaced by CRLF the next time Git touches it

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (feature/mensaje-despedida)
$ git commit -m "feat: agregar mensaje de despedida"
[feature/mensaje-despedida 76f0cf2] feat: agregar mensaje de despedida
1 file changed, 2 insertions(+)

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (feature/mensaje-despedida)
$ git switch main
Switched to branch 'main'

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git merge feature/mensaje-despedida
Updating 355b9f2..76f0cf2
Fast-forward
src/main/java/co/edu/icesi/Main.java | 2 ++
1 file changed, 2 insertions(+)

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git branch -d feature/mensaje-despedida
Deleted branch feature/mensaje-despedida (was 76f0cf2).

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git log --oneline --graph --decorate --all
* 76f0cf2 (HEAD -> main) feat: agregar mensaje de despedida
* 355b9f2 feat: agregar saludo personalizado
* 292f5cd chore: crear estructura inicial del proyecto

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git restore src/main/java/co/edu/icesi/Main.java

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git remote add origin https://github.com/gabrielcuartasbarrios-crypto/taller-git-maven.git

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git remote -v
origin  https://github.com/gabrielcuartasbarrios-crypto/taller-git-maven.git (fetch)
origin  https://github.com/gabrielcuartasbarrios-crypto/taller-git-maven.git (push)

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git push -u origin main
Enumerating objects: 29, done.
Counting objects: 100% (29/29), done.
Delta compression using up to 12 threads
Compressing objects: 100% (11/11), done.
Writing objects: 100% (29/29), 2.15 KiB | 439.00 KiB/s, done.
Total 29 (delta 4), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (4/4), done.
To https://github.com/gabrielcuartasbarrios-crypto/taller-git-maven.git
* [new branch]      main -> main
  branch 'main' set up to track 'origin/main'.

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git pull origin main
remote: Enumerating objects: 5, done.
remote: Counting objects: 100% (5/5), done.
remote: Compressing objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
Unpacking objects: 100% (3/3), 1.17 KiB | 57.00 KiB/s, done.
From https://github.com/gabrielcuartasbarrios-crypto/taller-git-maven
* branch            main       -> FETCH_HEAD
  76f0cf2..b7a341a  main       -> origin/main
  Updating 76f0cf2..b7a341a
  Fast-forward
  README.md | 4 +++-
  1 file changed, 3 insertions(+), 1 deletion(-)

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git log --oneline -all
error: switch `l' expects an integer value with an optional k/m/g suffix

gcuar@GabrielPC MINGW64 ~/Software Engineering/Semestre III/APO2/TallerGitMaven/taller-git-maven (main)
$ git log --oneline --all
b7a341a (HEAD -> main, origin/main) docs: añadir sección de aprendizajes
76f0cf2 feat: agregar mensaje de despedida
355b9f2 feat: agregar saludo personalizado
292f5cd chore: crear estructura inicial del proyecto
