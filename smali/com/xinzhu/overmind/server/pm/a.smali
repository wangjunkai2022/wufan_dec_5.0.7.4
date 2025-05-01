.class public final synthetic Lcom/xinzhu/overmind/server/pm/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic b:Lcom/xinzhu/overmind/server/pm/a;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/xinzhu/overmind/server/pm/a;

    invoke-direct {v0}, Lcom/xinzhu/overmind/server/pm/a;-><init>()V

    sput-object v0, Lcom/xinzhu/overmind/server/pm/a;->b:Lcom/xinzhu/overmind/server/pm/a;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Landroid/content/pm/ResolveInfo;

    check-cast p2, Landroid/content/pm/ResolveInfo;

    invoke-static {p1, p2}, Lcom/xinzhu/overmind/server/pm/b;->a(Landroid/content/pm/ResolveInfo;Landroid/content/pm/ResolveInfo;)I

    move-result p1

    return p1
.end method
