.class public Lcom/xinzhu/overmind/server/h;
.super Lcom/xinzhu/overmind/server/c$b;
.source "MindWidgetManagerService.java"

# interfaces
.implements Lcom/xinzhu/overmind/server/d;


# static fields
.field private static sService:Lcom/xinzhu/overmind/server/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/xinzhu/overmind/server/h;

    invoke-direct {v0}, Lcom/xinzhu/overmind/server/h;-><init>()V

    sput-object v0, Lcom/xinzhu/overmind/server/h;->sService:Lcom/xinzhu/overmind/server/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xinzhu/overmind/server/c$b;-><init>()V

    return-void
.end method

.method public static get()Lcom/xinzhu/overmind/server/h;
    .locals 1

    .line 1
    sget-object v0, Lcom/xinzhu/overmind/server/h;->sService:Lcom/xinzhu/overmind/server/h;

    return-object v0
.end method


# virtual methods
.method public systemReady()V
    .locals 0

    return-void
.end method
