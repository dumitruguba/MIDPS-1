#!/usr/bin/sh

path=$(dirname $PWD)${1##$(dirname $PWD)}

if [[ $1 == *.c ]]
then
	gcc -o hello ${path} &&
	./hello
	if [[ $2 == -rm ]];
	then rm -rf $PWD/hello.exe 
	fi	
else 
	if [[ $1 == *.cpp ]]
	then
		g++ -o hello ${path} &&
		./hello
		if [[ $2 == -rm ]];
		then rm -rf $PWD/hello.exe 
		fi	
	else 
		if [[ $1 == *.java ]]
		then
			javac ${path} &&
			cd $(dirname ${path}) &&
			java HelloWorld			
			if [[ $2 == -rm ]];
			then rm -rf HelloWorld.class
			fi	
		else 
			if [[ $1 == *.py ]]
			then
				python ${path}
			else 
				if [[ $1 == *.rb ]]
				then
					ruby ${path}
				fi
			fi
		fi
	fi
fi

for ((i=1;i<=$#;i++)); 
do
	if [ ${!i} = "-c" ]
	then ((i++))
		gcc -o hello $PWD/c/hello.c &&
		./hello
		if [[ $2 == -rm ]];
		then rm -rf $PWD/hello.exe
		fi	

	elif [ ${!i} = "-cpp" ];
	then ((i++)) 
		g++ -o hello $PWD/cpp/hello.cpp &&
		./hello
		if [[ $2 == -rm ]];
		then rm -rf $PWD/hello.exe
		fi	

	elif [ ${!i} = "-java" ];
	then ((i++)) 
		javac $PWD/java/hello.java &&
		cd $PWD/java/ &&
		java HelloWorld				
		if [[ $2 == -rm ]];
		then rm -rf HelloWorld.class
		fi	

	elif [ ${!i} = "-py" ];
	then ((i++)) 
		python $PWD/python/hello.py
		
	elif [ ${!i} = "-rb" ];
	then ((i++)) 
		ruby $PWD/ruby/hello.rb
		
	elif [ ${!i} = "-rm" ];
	then ((i++)) 
		rm -rf $PWD/hello.exe
		rm -rf $PWD/java/HelloWorld.class
		
	fi
done;
exit;