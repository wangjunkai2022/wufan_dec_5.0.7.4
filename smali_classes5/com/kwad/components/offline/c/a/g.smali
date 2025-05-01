.class public final Lcom/kwad/components/offline/c/a/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/offline/api/tk/IOfflineTKCallHandler;


# instance fields
.field private final aeg:Lcom/kwad/sdk/components/o;


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/components/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/offline/c/a/g;->aeg:Lcom/kwad/sdk/components/o;

    return-void
.end method


# virtual methods
.method public final callJS(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/g;->aeg:Lcom/kwad/sdk/components/o;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/kwad/sdk/components/o;->callJS(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
