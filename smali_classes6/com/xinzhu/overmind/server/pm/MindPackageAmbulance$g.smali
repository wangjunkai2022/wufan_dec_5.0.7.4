.class public final Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;
.super Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;
.source "MindPackageAmbulance.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c<",
        "Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ProviderIntentInfo;",
        ">;"
    }
.end annotation


# instance fields
.field public f:Landroid/content/pm/ProviderInfo;


# direct methods
.method public constructor <init>(Landroid/content/pm/PackageParser$Provider;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;-><init>(Landroid/content/pm/PackageParser$Component;)V

    .line 2
    iget-object v0, p1, Landroid/content/pm/PackageParser$Provider;->info:Landroid/content/pm/ProviderInfo;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;->f:Landroid/content/pm/ProviderInfo;

    .line 3
    iget-object v0, p1, Landroid/content/pm/PackageParser$Component;->intents:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    .line 6
    iget-object p1, p1, Landroid/content/pm/PackageParser$Component;->intents:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageParser$ProviderIntentInfo;

    .line 7
    iget-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    new-instance v2, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ProviderIntentInfo;

    invoke-direct {v2, v0}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ProviderIntentInfo;-><init>(Landroid/content/pm/PackageParser$IntentInfo;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    .line 8
    invoke-direct {p0, p1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;-><init>(Landroid/os/Parcel;)V

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    .line 10
    :try_start_0
    const-class v1, Landroid/content/pm/ProviderInfo;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ProviderInfo;

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;->f:Landroid/content/pm/ProviderInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 11
    :catchall_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 12
    invoke-static {p1}, Lcom/xinzhu/overmind/utils/helpers/i;->a(Landroid/os/Parcel;)Landroid/content/pm/ProviderInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;->f:Landroid/content/pm/ProviderInfo;

    .line 13
    invoke-static {}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "trying to restore providerinfo corrupt "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;->f:Landroid/content/pm/ProviderInfo;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 15
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    :goto_1
    add-int/lit8 v1, v0, -0x1

    if-lez v0, :cond_0

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 17
    new-instance v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$IntentInfo;

    invoke-direct {v0, p1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$IntentInfo;-><init>(Landroid/os/Parcel;)V

    .line 18
    iget-object v2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    new-instance v3, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ProviderIntentInfo;

    invoke-direct {v3, v0}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ProviderIntentInfo;-><init>(Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$IntentInfo;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v0, v1

    goto :goto_1

    :cond_0
    return-void
.end method
