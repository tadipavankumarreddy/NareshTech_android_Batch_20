### Git 
#### What is git?
Git is a free and open source ***distributed version control system*** designed to handle everything from small to very large projects with speed and efficiency.

To know more visit this [link](https://git-scm.com/)

#### Source Code Management
Source code management (SCM) is the process of tracking and controlling changes to a software project's source code. It's an integral part of any development project.

Git is developed by Linus Torvalds (the man behind linux kernel). It is developed to keep track of the changes to happening to linux kernel as it is contributed by many freelances across the world. 

Version Control Systems are of two kinds
- Centralized Version Control systems
  ![Picture](/cvcs.png)
- Distributed Version Control systems
  ![Picture](/dvcs.png)

### Initial Steps to set up the environment
- Download Git Software and install it [from here](https://git-scm.com)
- After the download and installation, follow the commands below to set up who you are and what your email id is 
  - set up the user name
    - git config --global user.name "Your Name"
  - Check the user name
    - git config user.name
  - Set up the user email
    - git config --global user.email "youremailid@doamin.com"
  - check the user email
    - git config user.email

**Repository** 
- A Git repository is a central storage location for managing and tracking changes in files and directories. It is a crucial component of the Git version control system, which enables collaborative development and allows multiple developers to work on a project simultaneously.

- To Create a repository or to initialize it, we run a command
  - git init
  - This command executes for just one time. If you re-execute it, it runs fine and reinitializes the same repository again. 

### What is a commit ?
- Commits can be thought of as snapshots or milestones along the timeline of a Git project. Commits are created with the git commit command to capture the state of a project at that point in time. Git Snapshots are always committed to the local repository.

### How do we make a commit ?
1. Add your files to ***Staging Area*** (Temporary place where your files are stored- From this point it is allowed to save the files to repository)  
   -  git add <file name.extension>
       - git add doc1.txt

   - How do I know if my file is in staging area or not ?
     - git status
   - How do I remove the file from the staging area ?
     - git rm  --cached <filename.extension>
     - git rm --cached doc1.txt
   - How do we add multiple files to the staging area ?
     - git add .
2. After adding the files to the staging area - you can now go ahead and make a commit so that the files will be stored as a snapshot (to which you can always come back later on in the future).
   - git commit -m "You specify something about this commit"
   - With every commit that you do on the repository will create a unique id for the commit which is 40 characters length. However, the first 7 characters will only be shown as the output. You can use the first 7 characters of a commit to roll your project back to this stage. 

   - git log
     - helps us to understand about the commits made on your project in a detiled manner. 
   - git log --oneline
     - to get the information in short

Now that you have two versions of the project and you are on the recent version.

You want to switch back to first version
   - git checkout |commit id|

### Git Branching
Git branching helps you manage the project that runs parllely among a big team 

![Picture](/ss456.png)

#### How to Create a Branch ?
- git branch |Branch Name|

#### How to check the number of branches present at any given point of time ?
- git branch

In the output, the branch you are currently on will be displayed in green preceeded by an astrisk symbol (*)

#### How do we switch between branches ?
- git switch branch_name

#### How to push the changes to remote repository (github)?
- First add the remote to your git (this is just one time setup)
  - git remote
    - to see the remotes added to your project
  - git remote add :Var name: :URL:
- Push the changes to the remote repository
  - git push :var name: :branch:

git pull command helps you get the changes synchrozed
- git pull batch_20 master

### Markdown Syntax - Refer the [link](/markdownsyntaxguide.md)


