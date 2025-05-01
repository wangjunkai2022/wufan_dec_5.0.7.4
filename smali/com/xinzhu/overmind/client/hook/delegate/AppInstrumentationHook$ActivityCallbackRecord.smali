.class Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;
.super Ljava/lang/Object;
.source "AppInstrumentationHook.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ActivityCallbackRecord"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;
    }
.end annotation


# instance fields
.field a:Landroid/app/Activity;

.field b:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->a:Landroid/app/Activity;

    .line 2
    iput-object p2, p0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->b:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    return-void
.end method
