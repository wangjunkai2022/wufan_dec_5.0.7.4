.class public Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;
.super Ljava/lang/Object;
.source "MindPackageAmbulance.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;,
        Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ActivityIntentInfo;,
        Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;,
        Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ProviderIntentInfo;,
        Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$h;,
        Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ServiceIntentInfo;,
        Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$d;,
        Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$e;,
        Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$f;,
        Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$SigningDetails;,
        Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;,
        Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$IntentInfo;
    }
.end annotation


# static fields
.field private static final A:Ljava/lang/String;

.field private static final B:I = 0x1

.field static final C:Ljava/lang/String; = "android.test.base"

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;",
            ">;"
        }
    .end annotation
.end field

.field static final D:Ljava/lang/String; = "android.test.mock"

.field static final E:Ljava/lang/String; = "android.test.runner"

.field static final F:Ljava/lang/String; = "org.apache.http.legacy"


# instance fields
.field private b:Z

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;",
            ">;"
        }
    .end annotation
.end field

.field public f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$h;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$d;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$e;",
            ">;"
        }
    .end annotation
.end field

.field public i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$f;",
            ">;"
        }
    .end annotation
.end field

.field public j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public k:[Landroid/content/pm/Signature;

.field public l:Landroid/content/pm/PackageParser$SigningDetails;

.field public m:Landroid/os/Bundle;

.field public n:Ljava/lang/String;

.field public o:I

.field public p:Ljava/lang/String;

.field public q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public r:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public s:I

.field public t:Landroid/content/pm/ApplicationInfo;

.field public u:Ljava/lang/String;

.field public v:[Ljava/lang/String;

.field public w:Ljava/lang/String;

.field public x:I

.field public y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/content/pm/ConfigurationInfo;",
            ">;"
        }
    .end annotation
.end field

.field public z:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/content/pm/FeatureInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->A:Ljava/lang/String;

    .line 2
    new-instance v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$a;

    invoke-direct {v0}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$a;-><init>()V

    sput-object v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/content/pm/PackageParser$Package;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->b:Z

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->c:Ljava/util/ArrayList;

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->d:Ljava/util/ArrayList;

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->e:Ljava/util/ArrayList;

    .line 6
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->f:Ljava/util/ArrayList;

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->g:Ljava/util/ArrayList;

    .line 8
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->h:Ljava/util/ArrayList;

    .line 9
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->i:Ljava/util/ArrayList;

    .line 10
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->j:Ljava/util/ArrayList;

    const/4 v1, 0x0

    .line 11
    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->y:Ljava/util/ArrayList;

    .line 12
    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->z:Ljava/util/ArrayList;

    .line 13
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p1, Landroid/content/pm/PackageParser$Package;->activities:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->c:Ljava/util/ArrayList;

    .line 14
    iget-object v1, p1, Landroid/content/pm/PackageParser$Package;->activities:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/PackageParser$Activity;

    .line 15
    new-instance v3, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;

    invoke-direct {v3, v2}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;-><init>(Landroid/content/pm/PackageParser$Activity;)V

    .line 16
    iget-object v2, v3, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ActivityIntentInfo;

    .line 17
    iput-object v3, v4, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ActivityIntentInfo;->i:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;

    goto :goto_1

    .line 18
    :cond_0
    iput-object p0, v3, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    .line 19
    iget-object v2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 20
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p1, Landroid/content/pm/PackageParser$Package;->receivers:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->d:Ljava/util/ArrayList;

    .line 21
    iget-object v1, p1, Landroid/content/pm/PackageParser$Package;->receivers:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/PackageParser$Activity;

    .line 22
    new-instance v3, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;

    invoke-direct {v3, v2}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;-><init>(Landroid/content/pm/PackageParser$Activity;)V

    .line 23
    iget-object v2, v3, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ActivityIntentInfo;

    .line 24
    iput-object v3, v4, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ActivityIntentInfo;->i:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;

    goto :goto_3

    .line 25
    :cond_2
    iput-object p0, v3, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    .line 26
    iget-object v2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 27
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p1, Landroid/content/pm/PackageParser$Package;->providers:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->e:Ljava/util/ArrayList;

    .line 28
    iget-object v1, p1, Landroid/content/pm/PackageParser$Package;->providers:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/PackageParser$Provider;

    .line 29
    iget-object v3, v2, Landroid/content/pm/PackageParser$Provider;->info:Landroid/content/pm/ProviderInfo;

    iget-object v3, v3, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    const-string v4, ";"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 30
    iget-object v4, v2, Landroid/content/pm/PackageParser$Provider;->info:Landroid/content/pm/ProviderInfo;

    aget-object v3, v3, v0

    iput-object v3, v4, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 31
    new-instance v3, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;

    invoke-direct {v3, v2}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;-><init>(Landroid/content/pm/PackageParser$Provider;)V

    .line 32
    iget-object v2, v3, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ProviderIntentInfo;

    .line 33
    iput-object v3, v4, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ProviderIntentInfo;->i:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;

    goto :goto_5

    .line 34
    :cond_4
    iput-object p0, v3, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    .line 35
    iget-object v2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 36
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Landroid/content/pm/PackageParser$Package;->services:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->f:Ljava/util/ArrayList;

    .line 37
    iget-object v0, p1, Landroid/content/pm/PackageParser$Package;->services:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/PackageParser$Service;

    .line 38
    new-instance v2, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$h;

    invoke-direct {v2, v1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$h;-><init>(Landroid/content/pm/PackageParser$Service;)V

    .line 39
    iget-object v1, v2, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ServiceIntentInfo;

    .line 40
    iput-object v2, v3, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ServiceIntentInfo;->i:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$h;

    goto :goto_7

    .line 41
    :cond_6
    iput-object p0, v2, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    .line 42
    iget-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 43
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Landroid/content/pm/PackageParser$Package;->instrumentation:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->g:Ljava/util/ArrayList;

    .line 44
    iget-object v0, p1, Landroid/content/pm/PackageParser$Package;->instrumentation:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/PackageParser$Instrumentation;

    .line 45
    new-instance v2, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$d;

    invoke-direct {v2, v1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$d;-><init>(Landroid/content/pm/PackageParser$Instrumentation;)V

    .line 46
    iput-object p0, v2, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    .line 47
    iget-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->g:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 48
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Landroid/content/pm/PackageParser$Package;->permissions:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->h:Ljava/util/ArrayList;

    .line 49
    iget-object v0, p1, Landroid/content/pm/PackageParser$Package;->permissions:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/PackageParser$Permission;

    .line 50
    new-instance v2, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$e;

    invoke-direct {v2, v1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$e;-><init>(Landroid/content/pm/PackageParser$Permission;)V

    .line 51
    iput-object p0, v2, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    .line 52
    iget-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 53
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Landroid/content/pm/PackageParser$Package;->permissionGroups:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->i:Ljava/util/ArrayList;

    .line 54
    iget-object v0, p1, Landroid/content/pm/PackageParser$Package;->permissionGroups:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/PackageParser$PermissionGroup;

    .line 55
    new-instance v2, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$f;

    invoke-direct {v2, v1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$f;-><init>(Landroid/content/pm/PackageParser$PermissionGroup;)V

    .line 56
    iput-object p0, v2, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    .line 57
    iget-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 58
    :cond_a
    iget-object v0, p1, Landroid/content/pm/PackageParser$Package;->requestedPermissions:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->j:Ljava/util/ArrayList;

    .line 59
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->u()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 60
    iget-object v0, p1, Landroid/content/pm/PackageParser$Package;->mSigningDetails:Landroid/content/pm/PackageParser$SigningDetails;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->l:Landroid/content/pm/PackageParser$SigningDetails;

    .line 61
    iget-object v0, v0, Landroid/content/pm/PackageParser$SigningDetails;->signatures:[Landroid/content/pm/Signature;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->k:[Landroid/content/pm/Signature;

    goto :goto_b

    .line 62
    :cond_b
    iget-object v0, p1, Landroid/content/pm/PackageParser$Package;->mSignatures:[Landroid/content/pm/Signature;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->k:[Landroid/content/pm/Signature;

    .line 63
    :goto_b
    iget-object v0, p1, Landroid/content/pm/PackageParser$Package;->mAppMetaData:Landroid/os/Bundle;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->m:Landroid/os/Bundle;

    .line 64
    iget-object v0, p1, Landroid/content/pm/PackageParser$Package;->packageName:Ljava/lang/String;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->n:Ljava/lang/String;

    .line 65
    iget v0, p1, Landroid/content/pm/PackageParser$Package;->mPreferredOrder:I

    iput v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->o:I

    .line 66
    iget-object v0, p1, Landroid/content/pm/PackageParser$Package;->mSharedUserId:Ljava/lang/String;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->p:Ljava/lang/String;

    .line 67
    iget-object v0, p1, Landroid/content/pm/PackageParser$Package;->usesLibraries:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->q:Ljava/util/ArrayList;

    .line 68
    iget-object v0, p1, Landroid/content/pm/PackageParser$Package;->usesOptionalLibraries:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->r:Ljava/util/ArrayList;

    .line 69
    iget v0, p1, Landroid/content/pm/PackageParser$Package;->mVersionCode:I

    iput v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->s:I

    .line 70
    iget-object v0, p1, Landroid/content/pm/PackageParser$Package;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->t:Landroid/content/pm/ApplicationInfo;

    .line 71
    iget-object v1, p1, Landroid/content/pm/PackageParser$Package;->mVersionName:Ljava/lang/String;

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->u:Ljava/lang/String;

    .line 72
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_c

    .line 73
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->splitNames:[Ljava/lang/String;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->v:[Ljava/lang/String;

    .line 74
    :cond_c
    iget-object v0, p1, Landroid/content/pm/PackageParser$Package;->baseCodePath:Ljava/lang/String;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->w:Ljava/lang/String;

    .line 75
    iget v0, p1, Landroid/content/pm/PackageParser$Package;->mSharedUserLabel:I

    iput v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->x:I

    .line 76
    iget-object v0, p1, Landroid/content/pm/PackageParser$Package;->configPreferences:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->y:Ljava/util/ArrayList;

    .line 77
    iget-object p1, p1, Landroid/content/pm/PackageParser$Package;->reqFeatures:Ljava/util/ArrayList;

    iput-object p1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->z:Ljava/util/ArrayList;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 6

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 79
    iput-boolean v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->b:Z

    .line 80
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->c:Ljava/util/ArrayList;

    .line 81
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->d:Ljava/util/ArrayList;

    .line 82
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->e:Ljava/util/ArrayList;

    .line 83
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->f:Ljava/util/ArrayList;

    .line 84
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->g:Ljava/util/ArrayList;

    .line 85
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->h:Ljava/util/ArrayList;

    .line 86
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->i:Ljava/util/ArrayList;

    .line 87
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->j:Ljava/util/ArrayList;

    const/4 v1, 0x0

    .line 88
    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->y:Ljava/util/ArrayList;

    .line 89
    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->z:Ljava/util/ArrayList;

    .line 90
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    .line 91
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 92
    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v3, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->c:Ljava/util/ArrayList;

    :goto_0
    add-int/lit8 v3, v2, -0x1

    if-lez v2, :cond_1

    .line 93
    new-instance v2, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;

    invoke-direct {v2, p1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;-><init>(Landroid/os/Parcel;)V

    .line 94
    iget-object v4, v2, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ActivityIntentInfo;

    .line 95
    iput-object v2, v5, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ActivityIntentInfo;->i:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;

    goto :goto_1

    .line 96
    :cond_0
    iput-object p0, v2, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    .line 97
    iget-object v4, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    move v2, v3

    goto :goto_0

    .line 98
    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 99
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->d:Ljava/util/ArrayList;

    :goto_2
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_3

    .line 100
    new-instance v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;

    invoke-direct {v1, p1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;-><init>(Landroid/os/Parcel;)V

    .line 101
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ActivityIntentInfo;

    .line 102
    iput-object v1, v4, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ActivityIntentInfo;->i:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;

    goto :goto_3

    .line 103
    :cond_2
    iput-object p0, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    .line 104
    iget-object v3, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->d:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v1, v2

    goto :goto_2

    .line 105
    :cond_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 106
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->e:Ljava/util/ArrayList;

    :goto_4
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_5

    .line 107
    new-instance v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;

    invoke-direct {v1, p1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;-><init>(Landroid/os/Parcel;)V

    .line 108
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;->f:Landroid/content/pm/ProviderInfo;

    iget-object v3, v3, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    const-string v4, ";"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 109
    iget-object v4, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;->f:Landroid/content/pm/ProviderInfo;

    aget-object v3, v3, v0

    iput-object v3, v4, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 110
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ProviderIntentInfo;

    .line 111
    iput-object v1, v4, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ProviderIntentInfo;->i:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;

    goto :goto_5

    .line 112
    :cond_4
    iput-object p0, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    .line 113
    iget-object v3, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->e:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v1, v2

    goto :goto_4

    .line 114
    :cond_5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 115
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->f:Ljava/util/ArrayList;

    :goto_6
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_7

    .line 116
    new-instance v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$h;

    invoke-direct {v1, p1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$h;-><init>(Landroid/os/Parcel;)V

    .line 117
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ServiceIntentInfo;

    .line 118
    iput-object v1, v4, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ServiceIntentInfo;->i:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$h;

    goto :goto_7

    .line 119
    :cond_6
    iput-object p0, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    .line 120
    iget-object v3, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->f:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v1, v2

    goto :goto_6

    .line 121
    :cond_7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 122
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->g:Ljava/util/ArrayList;

    :goto_8
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_8

    .line 123
    new-instance v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$d;

    invoke-direct {v1, p1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$d;-><init>(Landroid/os/Parcel;)V

    .line 124
    iput-object p0, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    .line 125
    iget-object v3, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->g:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v1, v2

    goto :goto_8

    .line 126
    :cond_8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 127
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->h:Ljava/util/ArrayList;

    :goto_9
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_9

    .line 128
    new-instance v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$e;

    invoke-direct {v1, p1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$e;-><init>(Landroid/os/Parcel;)V

    .line 129
    iput-object p0, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    .line 130
    iget-object v3, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->h:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v1, v2

    goto :goto_9

    .line 131
    :cond_9
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 132
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->i:Ljava/util/ArrayList;

    :goto_a
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_a

    .line 133
    new-instance v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$f;

    invoke-direct {v1, p1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$f;-><init>(Landroid/os/Parcel;)V

    .line 134
    iput-object p0, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    .line 135
    iget-object v3, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->i:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v1, v2

    goto :goto_a

    .line 136
    :cond_a
    iget-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->j:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readStringList(Ljava/util/List;)V

    .line 137
    sget-object v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->A:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "permissions "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->j:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 138
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->u()Z

    move-result v2

    if-eqz v2, :cond_c

    .line 139
    :try_start_1
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    .line 140
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 141
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "what class "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->setDataPosition(I)V

    const-string v4, "MindPackage$SigningDetails"

    .line 143
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_b

    const-string v2, "Legacy signing details found, solve it"

    .line 144
    invoke-static {v1, v2}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 145
    const-class v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$SigningDetails;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$SigningDetails;

    .line 146
    iget-object v1, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$SigningDetails;->b:[Landroid/content/pm/Signature;

    invoke-static {v1, v0}, Lcom/xinzhu/haunted/android/content/pm/j$a;->n([Landroid/content/pm/Signature;I)Lcom/xinzhu/haunted/android/content/pm/j$a;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lcom/xinzhu/haunted/android/content/pm/j$a;

    iget-object v0, v0, Lcom/xinzhu/haunted/android/content/pm/j$a;->a:Ljava/lang/Object;

    check-cast v0, Landroid/content/pm/PackageParser$SigningDetails;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->l:Landroid/content/pm/PackageParser$SigningDetails;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_b

    .line 147
    :cond_b
    :try_start_2
    invoke-static {p1}, Lcom/xinzhu/overmind/utils/helpers/k;->a(Landroid/os/Parcel;)Landroid/content/pm/PackageParser$SigningDetails;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->l:Landroid/content/pm/PackageParser$SigningDetails;

    .line 148
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "trying to restore signing details corrupt "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->l:Landroid/content/pm/PackageParser$SigningDetails;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_b

    :catchall_0
    move-exception v0

    .line 149
    :try_start_3
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 150
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 151
    sget-object v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->A:Ljava/lang/String;

    const-string v1, "fallback to system signingdetails read"

    invoke-static {v0, v1}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 152
    const-class v0, Landroid/content/pm/PackageParser$SigningDetails;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageParser$SigningDetails;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->l:Landroid/content/pm/PackageParser$SigningDetails;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_b

    :catchall_1
    move-exception v0

    .line 153
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 154
    :cond_c
    :goto_b
    sget-object v0, Landroid/content/pm/Signature;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/content/pm/Signature;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->k:[Landroid/content/pm/Signature;

    .line 155
    const-class v0, Landroid/os/Bundle;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->m:Landroid/os/Bundle;

    .line 156
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->n:Ljava/lang/String;

    .line 157
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->o:I

    .line 158
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->p:Ljava/lang/String;

    .line 159
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->q:Ljava/util/ArrayList;

    .line 160
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->r:Ljava/util/ArrayList;

    .line 161
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->s:I

    .line 162
    :try_start_4
    invoke-static {p1}, Lcom/xinzhu/overmind/utils/helpers/b;->a(Landroid/os/Parcel;)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->t:Landroid/content/pm/ApplicationInfo;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_c

    :catchall_2
    move-exception v0

    .line 163
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 164
    :goto_c
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->u:Ljava/lang/String;

    .line 165
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->w:Ljava/lang/String;

    .line 166
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->x:I

    .line 167
    sget-object v0, Landroid/content/pm/ConfigurationInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->y:Ljava/util/ArrayList;

    .line 168
    sget-object v0, Landroid/content/pm/FeatureInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->z:Ljava/util/ArrayList;

    .line 169
    sget-object v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->A:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "check san "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->t:Landroid/content/pm/ApplicationInfo;

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 170
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    .line 171
    :try_start_5
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "appendVersion"

    .line 172
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 173
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_d

    .line 174
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->v:[Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :cond_d
    return-void

    .line 175
    :catchall_3
    :cond_e
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    return-void

    .line 176
    :catchall_4
    sget-object v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->A:Ljava/lang/String;

    const-string v2, "MindPackage run into ambulance routine"

    invoke-static {v0, v2}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 177
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 178
    invoke-virtual {p0, p1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->a(Landroid/os/Parcel;)V

    return-void
.end method

.method static synthetic b()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->A:Ljava/lang/String;

    return-object v0
.end method

.method private c(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->r:Ljava/util/ArrayList;

    .line 2
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method


# virtual methods
.method protected a(Landroid/os/Parcel;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->c:Ljava/util/ArrayList;

    .line 3
    sget-object v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->A:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "how much act "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    add-int/lit8 v1, v0, -0x1

    if-lez v0, :cond_1

    .line 4
    new-instance v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;

    invoke-direct {v0, p1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;-><init>(Landroid/os/Parcel;)V

    .line 5
    iget-object v2, v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ActivityIntentInfo;

    .line 6
    iput-object v0, v3, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ActivityIntentInfo;->i:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;

    goto :goto_1

    .line 7
    :cond_0
    iput-object p0, v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    .line 8
    iget-object v2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v0, v1

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 10
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->d:Ljava/util/ArrayList;

    :goto_2
    add-int/lit8 v1, v0, -0x1

    if-lez v0, :cond_3

    .line 11
    new-instance v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;

    invoke-direct {v0, p1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;-><init>(Landroid/os/Parcel;)V

    .line 12
    iget-object v2, v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ActivityIntentInfo;

    .line 13
    iput-object v0, v3, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ActivityIntentInfo;->i:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;

    goto :goto_3

    .line 14
    :cond_2
    iput-object p0, v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    .line 15
    iget-object v2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v0, v1

    goto :goto_2

    .line 16
    :cond_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 17
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->e:Ljava/util/ArrayList;

    :goto_4
    add-int/lit8 v1, v0, -0x1

    const/4 v2, 0x0

    if-lez v0, :cond_5

    .line 18
    new-instance v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;

    invoke-direct {v0, p1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;-><init>(Landroid/os/Parcel;)V

    .line 19
    iget-object v3, v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;->f:Landroid/content/pm/ProviderInfo;

    iget-object v3, v3, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    const-string v4, ";"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 20
    iget-object v4, v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;->f:Landroid/content/pm/ProviderInfo;

    aget-object v2, v3, v2

    iput-object v2, v4, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 21
    iget-object v2, v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ProviderIntentInfo;

    .line 22
    iput-object v0, v3, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ProviderIntentInfo;->i:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;

    goto :goto_5

    .line 23
    :cond_4
    iput-object p0, v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    .line 24
    iget-object v2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v0, v1

    goto :goto_4

    .line 25
    :cond_5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 26
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->f:Ljava/util/ArrayList;

    :goto_6
    add-int/lit8 v1, v0, -0x1

    if-lez v0, :cond_7

    .line 27
    new-instance v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$h;

    invoke-direct {v0, p1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$h;-><init>(Landroid/os/Parcel;)V

    .line 28
    iget-object v3, v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ServiceIntentInfo;

    .line 29
    iput-object v0, v4, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$ServiceIntentInfo;->i:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$h;

    goto :goto_7

    .line 30
    :cond_6
    iput-object p0, v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    .line 31
    iget-object v3, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->f:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v0, v1

    goto :goto_6

    .line 32
    :cond_7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 33
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->g:Ljava/util/ArrayList;

    :goto_8
    add-int/lit8 v1, v0, -0x1

    if-lez v0, :cond_8

    .line 34
    new-instance v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$d;

    invoke-direct {v0, p1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$d;-><init>(Landroid/os/Parcel;)V

    .line 35
    iput-object p0, v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    .line 36
    iget-object v3, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->g:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v0, v1

    goto :goto_8

    .line 37
    :cond_8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 38
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->h:Ljava/util/ArrayList;

    :goto_9
    add-int/lit8 v1, v0, -0x1

    if-lez v0, :cond_9

    .line 39
    new-instance v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$e;

    invoke-direct {v0, p1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$e;-><init>(Landroid/os/Parcel;)V

    .line 40
    iput-object p0, v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    .line 41
    iget-object v3, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->h:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v0, v1

    goto :goto_9

    .line 42
    :cond_9
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 43
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->i:Ljava/util/ArrayList;

    :goto_a
    add-int/lit8 v1, v0, -0x1

    if-lez v0, :cond_a

    .line 44
    new-instance v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$f;

    invoke-direct {v0, p1}, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$f;-><init>(Landroid/os/Parcel;)V

    .line 45
    iput-object p0, v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->a:Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;

    .line 46
    iget-object v3, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->i:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v0, v1

    goto :goto_a

    .line 47
    :cond_a
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->j:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readStringList(Ljava/util/List;)V

    .line 48
    sget-object v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->A:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "permissions "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->j:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->u()Z

    move-result v1

    if-eqz v1, :cond_c

    .line 50
    :try_start_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 52
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "what class "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    const-string v1, "MindPackage$SigningDetails"

    .line 54
    invoke-virtual {v3, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_b

    const-string v1, "Legacy signing details found, solve it"

    .line 55
    invoke-static {v0, v1}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    const-class v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$SigningDetails;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$SigningDetails;

    .line 57
    iget-object v0, v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$SigningDetails;->b:[Landroid/content/pm/Signature;

    invoke-static {v0, v2}, Lcom/xinzhu/haunted/android/content/pm/j$a;->n([Landroid/content/pm/Signature;I)Lcom/xinzhu/haunted/android/content/pm/j$a;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lcom/xinzhu/haunted/android/content/pm/j$a;

    iget-object v0, v0, Lcom/xinzhu/haunted/android/content/pm/j$a;->a:Ljava/lang/Object;

    check-cast v0, Landroid/content/pm/PackageParser$SigningDetails;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->l:Landroid/content/pm/PackageParser$SigningDetails;

    goto :goto_b

    .line 58
    :cond_b
    invoke-static {p1}, Lcom/xinzhu/overmind/utils/helpers/k;->a(Landroid/os/Parcel;)Landroid/content/pm/PackageParser$SigningDetails;

    move-result-object v1

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->l:Landroid/content/pm/PackageParser$SigningDetails;

    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "trying to restore signing details corrupt "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->l:Landroid/content/pm/PackageParser$SigningDetails;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_b

    :catchall_0
    move-exception v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 61
    :cond_c
    :goto_b
    sget-object v0, Landroid/content/pm/Signature;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/content/pm/Signature;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->k:[Landroid/content/pm/Signature;

    .line 62
    const-class v0, Landroid/os/Bundle;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->m:Landroid/os/Bundle;

    .line 63
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->n:Ljava/lang/String;

    .line 64
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->o:I

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->p:Ljava/lang/String;

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->q:Ljava/util/ArrayList;

    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->r:Ljava/util/ArrayList;

    .line 68
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->s:I

    .line 69
    :try_start_1
    invoke-static {p1}, Lcom/xinzhu/overmind/utils/helpers/b;->a(Landroid/os/Parcel;)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->t:Landroid/content/pm/ApplicationInfo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_c

    :catchall_1
    move-exception v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 71
    :goto_c
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->u:Ljava/lang/String;

    .line 72
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->w:Ljava/lang/String;

    .line 73
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->x:I

    .line 74
    sget-object v0, Landroid/content/pm/ConfigurationInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->y:Ljava/util/ArrayList;

    .line 75
    sget-object v0, Landroid/content/pm/FeatureInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->z:Ljava/util/ArrayList;

    .line 76
    sget-object v0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->A:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "check san "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->t:Landroid/content/pm/ApplicationInfo;

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    .line 78
    :try_start_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "appendVersion"

    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 80
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_d

    .line 81
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->v:[Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :cond_d
    return-void

    .line 82
    :catchall_2
    :cond_e
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    return-void
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 3
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;

    .line 4
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->c:Ljava/lang/String;

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 5
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->d:Landroid/os/Bundle;

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 6
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;->f:Landroid/content/pm/ActivityInfo;

    invoke-virtual {p1, v3, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 7
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    if-eqz v3, :cond_1

    .line 8
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 9
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_1
    add-int/lit8 v3, v2, -0x1

    if-lez v2, :cond_0

    .line 10
    iget-object v2, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Parcelable;

    invoke-virtual {p1, v2, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    move v2, v3

    goto :goto_1

    .line 11
    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 13
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 14
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;

    .line 15
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->c:Ljava/lang/String;

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 16
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->d:Landroid/os/Bundle;

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 17
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$b;->f:Landroid/content/pm/ActivityInfo;

    invoke-virtual {p1, v3, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 18
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    if-eqz v3, :cond_4

    .line 19
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 20
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    :goto_3
    add-int/lit8 v4, v3, -0x1

    if-lez v3, :cond_3

    .line 21
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Parcelable;

    invoke-virtual {p1, v3, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    move v3, v4

    goto :goto_3

    .line 22
    :cond_4
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    .line 23
    :cond_5
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 24
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 25
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;

    .line 26
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->c:Ljava/lang/String;

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 27
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->d:Landroid/os/Bundle;

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 28
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$g;->f:Landroid/content/pm/ProviderInfo;

    invoke-virtual {p1, v3, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 29
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    if-eqz v3, :cond_7

    .line 30
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 31
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    :goto_5
    add-int/lit8 v4, v3, -0x1

    if-lez v3, :cond_6

    .line 32
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Parcelable;

    invoke-virtual {p1, v3, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    move v3, v4

    goto :goto_5

    .line 33
    :cond_7
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    .line 34
    :cond_8
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 35
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 36
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$h;

    .line 37
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->c:Ljava/lang/String;

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 38
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->d:Landroid/os/Bundle;

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 39
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$h;->f:Landroid/content/pm/ServiceInfo;

    invoke-virtual {p1, v3, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 40
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    if-eqz v3, :cond_a

    .line 41
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 42
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    :goto_7
    add-int/lit8 v4, v3, -0x1

    if-lez v3, :cond_9

    .line 43
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Parcelable;

    invoke-virtual {p1, v3, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    move v3, v4

    goto :goto_7

    .line 44
    :cond_a
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_6

    .line 45
    :cond_b
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 46
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 47
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_c
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$d;

    .line 48
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->c:Ljava/lang/String;

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 49
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->d:Landroid/os/Bundle;

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 50
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$d;->f:Landroid/content/pm/InstrumentationInfo;

    invoke-virtual {p1, v3, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 51
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    if-eqz v3, :cond_d

    .line 52
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 53
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    :goto_9
    add-int/lit8 v4, v3, -0x1

    if-lez v3, :cond_c

    .line 54
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Parcelable;

    invoke-virtual {p1, v3, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    move v3, v4

    goto :goto_9

    .line 55
    :cond_d
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_8

    .line 56
    :cond_e
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 57
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 58
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_f
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$e;

    .line 59
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->c:Ljava/lang/String;

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 60
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->d:Landroid/os/Bundle;

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 61
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$e;->f:Landroid/content/pm/PermissionInfo;

    invoke-virtual {p1, v3, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 62
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    if-eqz v3, :cond_10

    .line 63
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 64
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    :goto_b
    add-int/lit8 v4, v3, -0x1

    if-lez v3, :cond_f

    .line 65
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Parcelable;

    invoke-virtual {p1, v3, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    move v3, v4

    goto :goto_b

    .line 66
    :cond_10
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_a

    .line 67
    :cond_11
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 68
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 69
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_12
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$f;

    .line 70
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->c:Ljava/lang/String;

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 71
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->d:Landroid/os/Bundle;

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 72
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$f;->f:Landroid/content/pm/PermissionGroupInfo;

    invoke-virtual {p1, v3, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 73
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    if-eqz v3, :cond_13

    .line 74
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 75
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    :goto_d
    add-int/lit8 v4, v3, -0x1

    if-lez v3, :cond_12

    .line 76
    iget-object v3, v1, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Parcelable;

    invoke-virtual {p1, v3, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    move v3, v4

    goto :goto_d

    .line 77
    :cond_13
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_c

    .line 78
    :cond_14
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->j:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 79
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->u()Z

    move-result v0

    if-eqz v0, :cond_15

    .line 80
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->l:Landroid/content/pm/PackageParser$SigningDetails;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 81
    :cond_15
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->k:[Landroid/content/pm/Signature;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    .line 82
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->m:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 83
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->n:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 84
    iget v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->o:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 85
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->p:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 86
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->q:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 87
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->r:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 88
    iget v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->s:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 89
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->t:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 90
    iget-object p2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->u:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 91
    iget-object p2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->w:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 92
    iget p2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->x:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 93
    iget-object p2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->y:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 94
    iget-object p2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->z:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    const-string p2, "appendVersion"

    .line 95
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 p2, 0x1

    .line 96
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 97
    iget-object p2, p0, Lcom/xinzhu/overmind/server/pm/MindPackageAmbulance;->v:[Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    return-void
.end method
