FROM centos
VOLUME ["/myD1","/myD2"]
CMD echo "finished , ------ success "
CMD /bin/bash

docker run -it --name dc01 qjx/centos

docker run -it --name dc02 --volumes-from dc01 qjx/centos

docker run -it --name dc04 --volumes-from dc02 qjx/centos
