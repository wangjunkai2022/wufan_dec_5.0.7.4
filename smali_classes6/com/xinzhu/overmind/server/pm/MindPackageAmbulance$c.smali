.class public Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;
.super Ljava/lang/Object;
.source "MindPackageAmbulance.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<II:",
        "Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$IntentInfo;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "TII;>;"
        }
    .end annotation
.end field

.field public c:Ljava/lang/String;

.field public d:Landroid/os/Bundle;

.field public e:Landroid/content/ComponentName;


# direct methods
.method public constructor <init>(Landroid/content/pm/PackageParser$Component;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/pm/PackageParser$Component<",
            "*>;)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iget-object v0, p1, Landroid/content/pm/PackageParser$Component;->className:Ljava/lang/String;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->c:Ljava/lang/String;

    .line 6
    iget-object p1, p1, Landroid/content/pm/PackageParser$Component;->metaData:Landroid/os/Bundle;

    iput-object p1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->d:Landroid/os/Bundle;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->c:Ljava/lang/String;

    .line 3
    const-class v0, Landroid/os/Bundle;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->d:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public a()Landroid/content/ComponentName;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->e:Landroid/content/ComponentName;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->c:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 3
    new-instance v0, Landroid/content/ComponentName;

    iget-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    iget-object v1, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->n:Ljava/lang/String;

    iget-object v2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->c:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->e:Landroid/content/ComponentName;

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->e:Landroid/content/ComponentName;

    return-object v0
.end method
