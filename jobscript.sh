#!/bin/bash
echo "Bienvenido/a al planeta $planeta"
if [ "$agente" = "true" ]
then
    echo "Preparese para la mision agente X, que la fuerza te acompañe."
else
    echo "Disfruta el planeta humano/a $nombre, trata de no morir."
fi
echo "..."
sleep 10
echo "suerte! La necesitaras."
